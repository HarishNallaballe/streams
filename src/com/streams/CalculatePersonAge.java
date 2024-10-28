package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class CalculatePersonAge {
	public static void main(String[] args) {
	
		List<Person> list = Arrays.asList(new Person("Hari",28),new Person("Giri",28),new Person("Praveen",28));
		
		OptionalDouble average = list.stream().mapToInt(Person::getAge).average();
		
		if(average.isPresent()) {
			System.out.println(average.getAsDouble());
		}
	}
}
