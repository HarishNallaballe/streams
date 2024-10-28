package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hari","Harish","Praveen");
		Optional<String> str = list.stream().max(Comparator.comparingInt(String::length));
		if(str.isPresent()) {
			System.out.println(str.get());
		}
		
		
		Optional<String> findFirst = list.stream().sorted(Comparator.reverseOrder()).findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}
}
