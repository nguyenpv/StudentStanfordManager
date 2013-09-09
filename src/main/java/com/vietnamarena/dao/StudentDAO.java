/**
 * 
 */
package com.vietnamarena.dao;

import java.util.List;

import com.vietnamarena.dto.SMStudent;

/**
 * @author NguyenPV
 *
 */
public interface StudentDAO extends GenericDAO<SMStudent> {
	
	public List<SMStudent> findStudentByName(String name);

}
