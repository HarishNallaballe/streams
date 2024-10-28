package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,3,2,5,6,7,6,8);
		
		List<Integer> collect = list.stream().sorted().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
