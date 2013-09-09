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
@SequenceGenerator(name="smstudent_seq", sequenceName="SM_STUDENT_SEQ")
@Table(name="SM_STUDENT")
public class SMStudent {

	@Id
	@Column(name="SM_STUDENT_ID")
	@GeneratedValue(generator="smstudent_seq", strategy=GenerationType.SEQUENCE)
	private Long studentId;
	
	@Column(name="FIRST_NAME")
	private String firstname;
	
	@Column(name="LAST_NAME")
	private String lastname;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Transient
	private Double averagePoint;


	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}


	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}


	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}


	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the averagePoint
	 */
	public Double getAveragePoint() {
		return averagePoint;
	}


	/**
	 * @param averagePoint the averagePoint to set
	 */
	public void setAveragePoint(Double averagePoint) {
		this.averagePoint = averagePoint;
	}
	
}
