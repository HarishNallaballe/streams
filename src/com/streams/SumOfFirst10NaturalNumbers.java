package com.streams;

import java.util.stream.IntStream;

public class SumOfFirst10NaturalNumbers {
	public static void main(String[] args) {
		
		int stream = IntStream.range(1,11).sum();
		
			System.out.println(stream);
	}
}
