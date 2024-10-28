package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumofTransactionAmountForEachDay {
	public static void main(String[] args) {
	
		List<Transaction> list = Arrays.asList(new Transaction("2022-01-01",254),
				      new Transaction("2022-02-01",23),
				      new Transaction("2022-01-01",123));
		
		Map<String, Integer> collect = list.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingInt(Transaction::getAmount)));
	     System.out.println(collect);
	}
}
