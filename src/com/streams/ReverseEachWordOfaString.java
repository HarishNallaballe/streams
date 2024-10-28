package com.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfaString {
	public static void main(String[] args) {
	
		String str="Harish Nallaballe";
		
		String collect = Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		
		System.out.println(collect);
	}
}
