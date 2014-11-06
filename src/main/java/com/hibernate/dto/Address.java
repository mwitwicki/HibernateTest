package com.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private int _addressesID;
	
	@Column(name="ADDRESS_ITY")
	private String _city;
	
	@Column(name="ADDRESS_STREET")
	private String _street;
	
	/**
	 * @return the _addressesID
	 */
	public int getAddressID() {
		return _addressesID;
	}
	
	/**
	 * @return the _city
	 */
	public String getCity() {
		return _city;
	}
	/**
	 * @param _city the _city to set
	 */
	public void setCity(String _city) {
		this._city = _city;
	}
	/**
	 * @return the _street
	 */
	public String getStreet() {
		return _street;
	}
	/**
	 * @param _street the _street to set
	 */
	public void setStreet(String _street) {
		this._street = _street;
	}
	
	
}
