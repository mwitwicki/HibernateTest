package com.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * User entity
 */
@Entity
@Table(name="USER_DETAILS")
public class User {
	

	@Id
	@GeneratedValue
	private int _userID;
	
	private String _userName;
	private String _userAge;
	private String _userAdress;
	
	public int getUserID() {
		return _userID;
	}
	
	public void setUserID(int _userID) {
		this._userID = _userID;
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
	public String getUserAdress() {
		return _userAdress;
	}
	public void setUserAdress(String _userAdress) {
		this._userAdress = _userAdress;
	}
	
}
