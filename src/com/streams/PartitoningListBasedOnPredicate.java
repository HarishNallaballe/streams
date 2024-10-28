package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitoningListBasedOnPredicate {
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,6,6,7,7,8);
		
		Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		List<Integer> list2 = collect.get(true);
		List<Integer> list3 = collect.get(false);
		
		System.out.println(list2);
		System.out.println(list3);
	}
}
