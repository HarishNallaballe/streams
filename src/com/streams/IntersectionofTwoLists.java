package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionofTwoLists {
	public static void main(String[] args) {
	
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(3,4,5,6);
		
		List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
