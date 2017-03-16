package com.marakana.contacts.entities;

public class Address {

	private Long id;
	private String Street;
	private String city;
	private String state;
	private String zip;
	
	public Address(){
		
	}
	
	public Address(Long i,String street, String city, String state, String zip) {
		super();
		this.id=id;
		this.Street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
 
