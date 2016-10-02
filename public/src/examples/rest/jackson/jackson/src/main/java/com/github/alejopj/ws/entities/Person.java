package com.github.alejopj.ws.entities;

import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private boolean isAlive;
	private int age;
	private Address address;
	private List<PhoneNumber> phoneNumbers;
	private List<Person> children;
	private Person spouse;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean getIsAlive() {
		return isAlive;
	}
	
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	public List<Person> getChildren() {
		return children;
	}
	
	public void setChildren(List<Person> children) {
		this.children = children;
	}
	
	public Person getSpouse() {
		return spouse;
	}
	
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
}
