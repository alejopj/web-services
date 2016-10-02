package com.github.alejopj.ws.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.github.alejopj.ws.jaxb.entities.RestaurantMenu;

public class Main {
	
	private static String XML_INPUT_FILE_PATH = "./restaurant-menu.xml";
	private static String XML_OUTPUT_FILE_PATH = "./restaurant-menu-out.xml";
	
	public static void main(String[] args) {
		
		try {
			
			JAXBContext context = JAXBContext.newInstance(RestaurantMenu.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			File inputFile = new File(XML_INPUT_FILE_PATH);
			RestaurantMenu restaurantMenu =
					(RestaurantMenu) unmarshaller.unmarshal(inputFile);
			
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			File outputFile = new File(XML_OUTPUT_FILE_PATH);
			marshaller.marshal(restaurantMenu, outputFile);
			marshaller.marshal(restaurantMenu, System.out);
			
		} catch (JAXBException e) {
			
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
