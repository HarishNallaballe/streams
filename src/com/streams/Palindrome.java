package com.streams;

import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String[] args) {
		
		String str="madam";
		
		boolean match = IntStream.range(0,str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
		
		if(match) {
			System.out.println("pal");
		}else {
			System.out.println("not pal");
			
		}
		
	}
}
