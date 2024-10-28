package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindoutStringWhichStartWithNumber {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","2wo","three","4our");
		list.stream().filter(i->Character.isDigit(i.charAt(0))).forEach(System.out::println);
	}
}
