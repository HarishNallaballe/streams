package com.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacterInaString {
	public static void main(String[] args) {
	
		String str="Nallaballe Harish";
		
		Map<String, Long> collect = Arrays.stream(str.split(""))
				                           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		Map<Character, Long> collect2 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 Character string = collect2.entrySet().stream().filter(i->i.getValue()>1)
				          .map(i->i.getKey())
		                  .findFirst().get();
		System.out.println(string);
	}
}
