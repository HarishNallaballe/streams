package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,2,4,6);
		Set<Integer> set=new HashSet<Integer>();
		Set<Integer> collect = list.stream().filter(i-> !set.add(i)).collect(Collectors.toSet());
		System.out.println(collect);
	}
}
