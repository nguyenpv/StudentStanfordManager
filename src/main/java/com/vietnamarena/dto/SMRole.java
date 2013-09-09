/**
 * 
 */
package com.vietnamarena.dto;

/**
 * @author NguyenPV
 *
 */
public class SMRole extends BaseObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8614461070297881524L;
	
	private String roleId;
	private String roleName;
	
	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
