/**
 * 
 */
package com.vietnamarena.services;

import com.vietnamarena.dto.SMUser;

/**
 * @author NguyenPV
 *
 */
public interface UserService {
	
	public SMUser saveUser(SMUser user);
	
	public SMUser loginUser(String username, String password);

}
