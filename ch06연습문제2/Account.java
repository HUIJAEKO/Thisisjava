package ch06연습문제2;

public class Account {
	private int balance;
	private String name;
	private String number;
	
	public Account(int balance, String name, String number) {
		this.balance=balance;
		this.name=name;
		this.number=number;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}	
	public int getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	
}
