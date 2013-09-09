/**
 * 
 */
package com.vietnamarena.action;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.vietnamarena.dto.SMStudent;
import com.vietnamarena.services.StudentService;

/**
 * @author NguyenPV
 *
 */
public class UpdateStudentAction extends ActionSupport {
	
	private static Log log = LogFactory.getLog(UpdateStudentAction.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 3118244537351449072L;
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		log.debug("-- UpdateStudentAction -- execute --");
		SMStudent studentRs = studentService.updateStudent(student);
		log.debug("-- UpdateStudentAction -- execute -- rs -- :" + studentRs);
		if (studentRs == null) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate() {
		if (student == null) {
			addActionError("Please enter student info.");
			return;
		}
		if (StringUtils.isBlank(student.getFirstname())) {
			addActionError("Please enter student first name.");
		}
		if (StringUtils.isBlank(student.getLastname())) {
			addActionError("Please enter student last name.");
		}
	}

	private StudentService studentService;
	private SMStudent student;
	
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
	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
