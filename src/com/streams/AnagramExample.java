package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramExample {
	public static void main(String[] args) {
	
		String str1="madam";
		String str2="damma";
		
		String collect = Stream.of(str2.split("")).map(String::toUpperCase).sorted()
				                                  .collect(Collectors.joining());
		
		String collect2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted()
		                         .collect(Collectors.joining());
		
		
		if(collect.equals(collect2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
}
