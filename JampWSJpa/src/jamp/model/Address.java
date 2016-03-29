package jamp.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name = "STREET")
	private String street;
	
	@Column(name = "HOUSE")
	private String house;
	
	public Address() {}	
	
	public Address(String street, String house) {
		super();
		this.street = street;
		this.house = house;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHouse() {
		return house;
	}
	
	public void setHouse(String house) {
		this.house = house;
	}	

}
