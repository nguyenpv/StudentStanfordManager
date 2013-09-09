/**
 * 
 */
package com.vietnamarena.services.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.vietnamarena.dao.StudentDAO;
import com.vietnamarena.dto.SMStudent;
import com.vietnamarena.services.StudentService;

/**
 * @author NguyenPV
 *
 */
public class StudentServiceImpl implements StudentService {
	
	private static Log log = LogFactory.getLog(StudentServiceImpl.class);

	/* (non-Javadoc)
	 * @see com.vietnamarena.services.UserService#registerUser(com.vietnamarena.dto.AAMUser)
	 */
	public SMStudent saveStudent(SMStudent student) {
		log.debug("saveStudent" + student);
		if (student == null) {
			return null;
		}
		return studentDAO.saveOrUpdate(student);
	}

	@Override
	public List<SMStudent> searchStudent(String name) {
		log.debug("searchStudent:name:" + name);
		if (StringUtils.isBlank(name)) {
			return studentDAO.findAll();
		}
		return (List<SMStudent>) studentDAO.findStudentByName(name);
	}

	@Override
	public Boolean removeStudents(String studentIdListSeparatedByComma) {
		String[] studentIdArr = StringUtils.split(studentIdListSeparatedByComma, ",");
		if (studentIdArr == null || studentIdArr.length <= 0) {
			return Boolean.FALSE;
		}
		Long idToRemove = null;
		for (String studentId : studentIdArr) {
			if (StringUtils.isBlank(studentId)) {
				continue;
			}
			idToRemove = Long.parseLong(studentId.trim());
			studentDAO.remove(idToRemove);
		}
		return Boolean.TRUE;
	}
	

	@Override
	public SMStudent getStudentById(String studentId) {
		if (StringUtils.isBlank(studentId)) {
			return null;
		}
		Long idVal = Long.parseLong(studentId);
		SMStudent student = studentDAO.get(idVal);
		return student;
	}
	
	public SMStudent updateStudent(SMStudent student) {
		if (student == null ) {
			return null;
		}
		Long idVal = student.getStudentId();
		if (idVal == null) {
			return null;
		}
		SMStudent currentStudent = studentDAO.get(idVal);
		currentStudent.setAddress(student.getAddress());
		currentStudent.setEmail(student.getEmail());
		currentStudent.setFirstname(student.getFirstname());
		currentStudent.setLastname(student.getLastname());
		currentStudent.setPhoneNumber(student.getPhoneNumber());
		return studentDAO.saveOrUpdate(currentStudent);
	}
	
	/* **** GETTERS & SETTERS **** */
	private StudentDAO studentDAO;

	/**
	 * @param studentDAO the studentDAO to set
	 */
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}


}
