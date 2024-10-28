package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetThreeMaxNumbersThreeMinNumbers {
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,5,15,20);
		
		List<Integer> collect = list.stream().sorted().limit(3).collect(Collectors.toList());
		
		List<Integer> collect2 = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
	
	    System.out.println(collect);
	    
	    System.out.println(collect2);
	}
}
