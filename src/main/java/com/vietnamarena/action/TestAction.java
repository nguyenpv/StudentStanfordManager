/**
 * 
 */
package com.vietnamarena.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author NguyenPV
 *
 */
public class TestAction extends ActionSupport {
	
	private static Log log = LogFactory.getLog(TestAction.class);

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		log.debug("test action execute..");
		return SUCCESS;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3515512079587311170L;

}
