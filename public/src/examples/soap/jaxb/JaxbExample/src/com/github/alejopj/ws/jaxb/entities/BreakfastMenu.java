package com.github.alejopj.ws.jaxb.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "breakfast_menu")
public class BreakfastMenu {

	private List<Food> breakfastMenu;

	@XmlElement(name = "food")
	public List<Food> getBreakfastMenu() {
		return breakfastMenu;
	}

	public void setBreakfastMenu(List<Food> breakfastMenu) {
		this.breakfastMenu = breakfastMenu;
	}
}
