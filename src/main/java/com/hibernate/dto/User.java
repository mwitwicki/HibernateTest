package com.hibernate.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

/*
 * User entity
 */
@Entity
@Table(name="USER_DETAILS")
public class User {
	

	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int _userID;
	
	@Column(name="USER_NAME")
	private String _userName;
	
	@Column(name="USER_AGE")
	private String _userAge;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="ADDRESS_ID")
	private Address userAddress;
	
	
	/**
	 * @return the userAddress
	 */
	public Address getUserAddress() {
		return userAddress;
	}

	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserID() {
		return _userID;
	}
	
	
	public String getUserName() {
		return _userName;
	}
	public void setUserName(String _userName) {
		this._userName = _userName;
	}
	public String getUserAge() {
		return _userAge;
	}
	public void setUserAge(String _userAge) {
		this._userAge = _userAge;
	}
	
}
