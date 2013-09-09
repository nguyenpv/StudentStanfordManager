/**
 * 
 */
package com.vietnamarena.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.vietnamarena.dto.SMStudent;
import com.vietnamarena.services.StudentService;

/**
 * @author NguyenPV
 *
 */
public class SearchStudentAction extends ActionSupport {

	private static Log log = LogFactory.getLog(SearchStudentAction.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 3184194384414446491L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		log.debug("search student by name:" + name);
		studentList = studentService.searchStudent(name);
		log.debug("studentList:" + studentList);
		return SUCCESS;
	}
	
	private String name;
	private StudentService studentService;
	private List<SMStudent> studentList;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param studentService the studentService to set
	 */
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	/**
	 * @return the studentList
	 */
	public List<SMStudent> getStudentList() {
		return studentList;
	}
	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<SMStudent> studentList) {
		this.studentList = studentList;
	}
}
