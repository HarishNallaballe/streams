package com.streams;

import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,5,56,6,7,8);
		
		boolean anyMatch = list.stream().anyMatch(PrimeNumber::isPrime);
		System.out.println(anyMatch);
		
	}
	
	public static boolean isPrime(int num) {
		if(num==0 || num==1) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
