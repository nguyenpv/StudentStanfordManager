/**
 * 
 */
package com.vietnamarena.action;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author NguyenPV
 *
 */
public class LogoutAction extends ActionSupport {
	
	private static Log log = LogFactory.getLog(LogoutAction.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = -5176040627243045807L;
	
	public String execute() {
		log.debug("Try to logout..");
		clearSession();
		log.debug("Logout successfully..");
		return SUCCESS;
	}
	
	private void clearSession() {
		log.debug("clearSession");
		@SuppressWarnings("rawtypes")
		Map session = ActionContext.getContext().getSession();
		//session.remove(AAMConstants.USER_KEY);
		session.clear();
	}
}
