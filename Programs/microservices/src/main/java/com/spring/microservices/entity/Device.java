package com.spring.microservices.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Device implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deviceId;
	
	private String deviceName;
	
	private String deviceLocation;
	
	@OneToOne(mappedBy="device", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JsonManagedReference
	private Customer customer;

	public Device() {
		super();
	}

	public Device(Integer deviceId, String deviceName, String deviceLocation, Customer customer) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.deviceLocation = deviceLocation;
		this.customer = customer;
	}

	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceLocation() {
		return deviceLocation;
	}

	public void setDeviceLocation(String deviceLocation) {
		this.deviceLocation = deviceLocation;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

    
	
	
}
