package com.github.alejopj.ws.jaxb.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "restaurant_menu")
public class RestaurantMenu {

	private BreakfastMenu breakfastMenu;

	@XmlElement(name = "breakfast_menu")
	public BreakfastMenu getBreakfastMenu() {
		return breakfastMenu;
	}

	public void setBreakfastMenu(BreakfastMenu breakfastMenu) {
		this.breakfastMenu = breakfastMenu;
	}	
}
