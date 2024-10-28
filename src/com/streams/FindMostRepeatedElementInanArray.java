package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElementInanArray {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","guava","apple","apple","grapes","guava","banana");
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		Optional<Entry<String, Long>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());
	
		System.out.println(max.get());
	}
}
