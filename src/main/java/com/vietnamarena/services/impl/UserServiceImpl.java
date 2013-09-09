/**
 * 
 */
package com.vietnamarena.services.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vietnamarena.dao.UserDAO;
import com.vietnamarena.dto.SMUser;
import com.vietnamarena.services.UserService;
import com.vietnamarena.utils.PasswordUtils;

/**
 * @author NguyenPV
 *
 */
public class UserServiceImpl implements UserService {
	
	private static Log log = LogFactory.getLog(UserServiceImpl.class);

	/* (non-Javadoc)
	 * @see com.vietnamarena.services.UserService#registerUser(com.vietnamarena.dto.AAMUser)
	 */
	@Override
	public SMUser saveUser(SMUser user) {
		// TODO Auto-generated method stub
		log.debug("saveUser" + user);
		return userDAO.saveOrUpdate(user);
	}

	/* (non-Javadoc)
	 * @see com.vietnamarena.services.UserService#loginUser(java.lang.String, java.lang.String)
	 */
	@Override
	public SMUser loginUser(String username, String password) {
		// TODO Auto-generated method stub
		log.debug("loginUser:" + username + ",password:" + password);
		SMUser user = userDAO.findUserByUsername(username);
		if (user == null) {
			log.debug("loginUser: null user");
			return null;
		}
		if (PasswordUtils.isPasswordValid(user.getPassword(), password)) {
			log.debug("loginUser: password is valid");
			return user;
		}
		log.debug("loginUser: password is invalid");
		return null;
	}
	
	/* **** GETTERS & SETTERS **** */
	private UserDAO userDAO;

	/**
	 * @param userDAO the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
