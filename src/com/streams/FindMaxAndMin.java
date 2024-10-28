package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class FindMaxAndMin {
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,5,15,20);
		
		Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
		System.out.println(min.get());
		
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		System.out.println(max.get());
		
		int max2 = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(max2);
		
		OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
		System.out.println(average.getAsDouble());
		
	}
}
