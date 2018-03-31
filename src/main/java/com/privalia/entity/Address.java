package com.privalia.entity;

//@Component("address")
public class Address {
	private int idAddress;
	private String street;
	
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	public Address(int idAddress,String street){
		super();
		this.idAddress = idAddress;
		this.street = street;
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
