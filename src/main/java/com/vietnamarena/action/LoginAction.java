/**
 * 
 */
package com.vietnamarena.action;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.gigya.socialize.GSRequest;
import com.gigya.socialize.GSResponse;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.vietnamarena.dto.SMUser;
import com.vietnamarena.services.UserService;
import com.vietnamarena.utils.PasswordUtils;
import com.vietnamarena.utils.SMConstants;

/**
 * @author NguyenPV
 *
 */
public class LoginAction extends ActionSupport {
	
	private static Log log = LogFactory.getLog(LoginAction.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 5500625053719100684L;
	
	/* **** BUSINESS METHODS ***** */
	public String execute() {
		@SuppressWarnings("rawtypes")
		Map session = ActionContext.getContext().getSession();
		SMUser user = (SMUser) session.get(SMConstants.USER_KEY);
		if (user == null) {
			return LOGIN;
		}
		return SUCCESS;
	}
	
	public String loginUser() {
		log.debug("loginUser");
		clearSession();
		System.out.println("uidInfo:" + uidInfo);
		log.debug("uidInfo:" + uidInfo);
		if (!StringUtils.isBlank(uidInfo)) {
	           
            log.debug("Logging from social network account...");
            
            // Setup Gigya request
            String gigyaMethod = "socialize.getUserInfo";
            GSRequest request = new GSRequest(SMConstants.API_KEY, SMConstants.SECRET_KEY, gigyaMethod);
            request.setParam("uid", uidInfo);
            
            //Setup Proxy
/*            Proxy fsoftProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("fsoft-proxy", 8080));        
            
            final char[] proxyPass = {'x','x','x'};
            final String proxyUser = "quanglh1";
            Authenticator.setDefault(new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication (proxyUser, proxyPass);
                }
             });
            
            request.setProxy(fsoftProxy);*/
            
            // Send request to Gigya
            GSResponse response = request.send();
         
            // Validate results 
            if (response.getErrorCode() == 0) {   // SUCCESS! response status = OK  
                String nickname = response.getString("nickname", "");
                log.debug("Logged successful by social network, account = " + nickname);
                SMUser userInfoFromSocialAcc = new SMUser();
                userInfoFromSocialAcc.setUsername(nickname);
                userInfoFromSocialAcc.setEtoken(uidInfo);
                storeUserInfoToSession(userInfoFromSocialAcc);
                return SUCCESS;
            } else {  // Error
            	addActionError("Could not get user info from Gigya.");
            	return INPUT;
            }                
		}
		
		StringBuilder errorMsg = new StringBuilder();
		if (StringUtils.isBlank(username)) {
			errorMsg.append("Username is required.");
		}
		if (StringUtils.isBlank(password)) {
			errorMsg.append("Password is required.");
		}
		if (errorMsg.length() > 0) {
			addActionError(errorMsg.toString());
			return INPUT;
		}
		SMUser user = userService.loginUser(username, password);
		if (user == null) {
			addActionError("Username and password is invalid. Please try again.");
			return INPUT;
		}
		storeUserInfoToSession(user);
		return SUCCESS;
	}
	
	public String registerUser() {
		log.debug("registerUser");
		SMUser testUser = new SMUser();
		testUser.setUsername("admin");
		testUser.setEmail("pvnbk2006@gmail.com");
		testUser.setPassword(PasswordUtils.encodePassword("admin"));
		testUser.setStatus("ACTIVE");
		SMUser retUser = userService.saveUser(testUser);
		log.debug("registerUser--rs:" + retUser);
		return SUCCESS;
	}
	
	
	@SuppressWarnings("unchecked")
	private void storeUserInfoToSession(SMUser user) {
		log.debug("storeUserInfoToSession");
		@SuppressWarnings("rawtypes")
		Map session = ActionContext.getContext().getSession();
		session.put(SMConstants.USER_KEY, user);
	}
	
	private void clearSession() {
		log.debug("clearSession");
		@SuppressWarnings("rawtypes")
		Map session = ActionContext.getContext().getSession();
		//session.remove(AAMConstants.USER_KEY);
		session.clear();
	}
	
	/* **** GETTERS & SETTERS **** */
	private UserService userService;
	private String username;
	private String password;
	private String uidInfo;
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @return the uidInfo
	 */
	public String getUidInfo() {
		return uidInfo;
	}

	/**
	 * @param uidInfo the uidInfo to set
	 */
	public void setUidInfo(String uidInfo) {
		this.uidInfo = uidInfo;
	}
}
