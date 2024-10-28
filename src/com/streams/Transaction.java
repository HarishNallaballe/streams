package com.streams;

public class Transaction {
	
	String date;
	int amount;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Transaction(String date, int amount) {
		super();
		this.date = date;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [date=" + date + ", amount=" + amount + "]";
	}
}
