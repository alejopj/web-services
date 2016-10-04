package com.github.alejopj.ws.jaxb.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "restaurant_menu")
public class RestaurantMenu {

	private List<Food> breakfastMenu;

	@XmlElementWrapper(name = "breakfast_menu")
	@XmlElement(name = "food")
	public List<Food> getBreakfastMenu() {
		return breakfastMenu;
	}

	public void setBreakfastMenu(List<Food> breakfastMenu) {
		this.breakfastMenu = breakfastMenu;
	}
}
