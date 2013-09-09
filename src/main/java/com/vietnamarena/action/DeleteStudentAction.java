/**
 * 
 */
package com.vietnamarena.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.vietnamarena.services.StudentService;

/**
 * @author NguyenPV
 *
 */
public class DeleteStudentAction extends ActionSupport {
	
	private static Log log = LogFactory.getLog(DeleteStudentAction.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 4835977480253237960L;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		log.debug("DeleteStudentAction:execute:");
		Boolean rs = studentService.removeStudents(studentIdStrList);
		log.debug("DeleteStudentAction:execute:rs:" + rs);
		if (!rs) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	private String studentIdStrList;
	private StudentService studentService;

	/**
	 * @return the studentIdStrList
	 */
	public String getStudentIdStrList() {
		return studentIdStrList;
	}
	/**
	 * @param studentIdStrList the studentIdStrList to set
	 */
	public void setStudentIdStrList(String studentIdStrList) {
		this.studentIdStrList = studentIdStrList;
	}
	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
}
