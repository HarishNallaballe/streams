package com.streams;

import java.util.Arrays;
import java.util.List;

public class FindTheKthSmallestElement {
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(2,3,4,6,4,5,7,8);
		
		Integer integer = list.stream().sorted().distinct().skip(2).findAny().get();
		System.out.println(integer);
		
	}
}
