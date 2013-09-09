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
public class CreateStudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5451519949457737293L;
	private static Log log = LogFactory.getLog(CreateStudentAction.class);

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		log.debug("Create student :" + student);
		SMStudent savedStudent = studentService.saveStudent(student);
		if (savedStudent == null) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate() {
		// validate student first name and last name
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

	private SMStudent student;
	private StudentService studentService;

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
	 * @return the studentService
	 */
	public StudentService getStudentService() {
		return studentService;
	}

	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
}
