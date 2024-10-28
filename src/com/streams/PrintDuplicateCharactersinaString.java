package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDuplicateCharactersinaString {
	public static void main(String[] args) {
		String str="harish";
		Set<String> set=new HashSet();
		Set<Character> collect = str.chars().mapToObj(c->(char)c).filter(i->!set.add(i+"")).collect(Collectors.toSet());
		System.out.println(collect);
		
	}
}
