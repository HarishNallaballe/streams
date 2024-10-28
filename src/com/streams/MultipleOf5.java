package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,5,15,20);
		
		List<Integer> collect = list.stream().filter(i->i%5==0).collect(Collectors.toList());
		System.out.println(collect);
	}
}
