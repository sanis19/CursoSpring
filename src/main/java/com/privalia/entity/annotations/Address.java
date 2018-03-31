package com.privalia.entity.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	private int idAddress;
	private String street;
	
	public int getIdAddress() {
		return idAddress;
	}
	@Autowired
	@Value("1")
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	public String getStreet() {
		return street;
	}
	@Autowired
	@Value("Calle 1")
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	public Address(int idAddress,String street){
		super();
		this.idAddress = idAddress;
		this.street = street;
	}
	
	public Address() {
		super();
	}
	@Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.idAddress);
		stringBuilder.append(" ");
		stringBuilder.append(this.street);
		
		return stringBuilder.toString();
	}
	
	
	
}
