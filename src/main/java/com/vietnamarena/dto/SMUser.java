/**
 * 
 */
package com.vietnamarena.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author NguyenPV
 *
 */
@Entity
@SequenceGenerator(name="smuser_seq", sequenceName="SM_USER_SEQ")
@Table(name="SM_USER")
public class SMUser extends BaseObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2740888851099920358L;

	@Id
	@Column(name="SM_USER_ID")
	@GeneratedValue(generator="smuser_seq", strategy=GenerationType.SEQUENCE)
	private Long userId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="PASSWORD")
	private String password;
	//private String roleId;
	
	@Transient
	private String etoken;
	
	/**
	 * @return the aamUserId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param aamUserId the aamUserId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the aamUsername
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param aamUsername the aamUsername to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the etoken
	 */
	public String getEtoken() {
		return etoken;
	}
	/**
	 * @param etoken the etoken to set
	 */
	public void setEtoken(String etoken) {
		this.etoken = etoken;
	}
}
