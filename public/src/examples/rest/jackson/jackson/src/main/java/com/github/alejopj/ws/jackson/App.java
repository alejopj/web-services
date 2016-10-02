package com.github.alejopj.ws.jackson;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.alejopj.ws.entities.Person;

public class App {
	
	private static ObjectMapper mapper = new ObjectMapper();
	private static File inputFile = new File("./person.json");
	private static File outputFile = new File("./person-out.json");
	private static Person person;
	
	public static void main(String[] args) {
		
		try {
			
			person = mapper.readValue(inputFile, Person.class);
			String json = mapper.writerWithDefaultPrettyPrinter().
					writeValueAsString(person);
			System.out.println(json);
			
			mapper.writeValue(outputFile, person);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
