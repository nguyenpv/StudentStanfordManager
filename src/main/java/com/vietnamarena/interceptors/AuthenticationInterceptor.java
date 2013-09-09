/**
 * 
 */
package com.vietnamarena.interceptors;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.vietnamarena.dto.SMUser;
import com.vietnamarena.utils.SMConstants;

/**
 * @author NguyenPV
 *
 */
public class AuthenticationInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8291808994625811145L;
	
	private static Log log = LogFactory.getLog(AuthenticationInterceptor.class);

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#destroy()
	 */
	@Override
	public void destroy() {
		log.debug("Destroyed..");
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#init()
	 */
	@Override
	public void init() {
		log.debug("Initiated..");
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.Interceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		log.debug("Do intercept for " + invocation.getAction().toString());
		@SuppressWarnings("rawtypes")
		Map session = invocation.getInvocationContext().getSession();
		SMUser user = (SMUser) session.get(SMConstants.USER_KEY);
		if (user == null) {
			log.debug("You do not have the authorization role to access this action. Please log in.");
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

}
