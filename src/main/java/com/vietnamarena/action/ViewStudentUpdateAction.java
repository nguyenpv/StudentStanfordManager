/**
 * 
 */
package com.vietnamarena.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.vietnamarena.dto.SMStudent;
import com.vietnamarena.services.StudentService;

/**
 * @author NguyenPV
 *
 */
public class ViewStudentUpdateAction extends ActionSupport {
	
	private static Log log = LogFactory.getLog(ViewStudentUpdateAction.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = -3515512079587311170L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		log.debug("view student update action execute..:" + studentIdStr);
		student = studentService.getStudentById(studentIdStr);
		log.debug("student:" + student);
		if (student == null) {
			return ERROR;
		}
		return SUCCESS;
	}

	private String studentIdStr;
	private StudentService studentService;
	private SMStudent student;

	/**
	 * @return the studentIdStr
	 */
	public String getStudentIdStr() {
		return studentIdStr;
	}
	/**
	 * @param studentIdStr the studentIdStr to set
	 */
	public void setStudentIdStr(String studentIdStr) {
		this.studentIdStr = studentIdStr;
	}
	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	/**
	 * @return the student
	 */
	public SMStudent getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(SMStudent student) {
		this.student = student;
	}

}
