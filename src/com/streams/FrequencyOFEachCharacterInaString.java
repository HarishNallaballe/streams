package com.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOFEachCharacterInaString {
	public static void main(String[] args) {
	
		String str="harish";
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
	}
}
