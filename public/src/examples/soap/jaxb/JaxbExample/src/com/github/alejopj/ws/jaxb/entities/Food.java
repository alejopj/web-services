package com.github.alejopj.ws.jaxb.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "food")
public class Food {

	private String name;
	private String price;
	private String description;
	private int calories;

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "price")
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	@XmlElement(name = "description")
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElement(name = "calories")
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
