/**
 * 
 */
package com.vietnamarena.services;

import java.util.List;

import com.vietnamarena.dto.SMStudent;

/**
 * @author NguyenPV
 *
 */
public interface StudentService {
	
	public SMStudent saveStudent(SMStudent student);
	
	public List<SMStudent> searchStudent(String name);
	
	public Boolean removeStudents(String studentIdListSeparatedByComma);
	
	public SMStudent getStudentById(String studentId);
	
	public SMStudent updateStudent(SMStudent student);
	
}
