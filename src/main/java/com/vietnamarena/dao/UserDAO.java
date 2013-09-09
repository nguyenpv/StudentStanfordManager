/**
 * 
 */
package com.vietnamarena.dao;

import com.vietnamarena.dto.SMUser;

/**
 * @author NguyenPV
 *
 */
public interface UserDAO extends GenericDAO<SMUser> {
	
	public SMUser findUserByUsername(String username);

}
