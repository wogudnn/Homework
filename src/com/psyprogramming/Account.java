package com.psyprogramming;

public class Account {

	private String accountName;
	private String accountNumber;
	private String accountDate;
	private int balance;
	
	
	public Account(String accountName, String accountNumber, String accountDate, int balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountDate = accountDate;
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void receiptMoney(int money) {
		this.balance = balance + money;
		
	}
	public void withdrawalMoney(int money) {
		this.balance = balance-money;
		
	}
	public void showMyMoney( ) {
		System.out.printf("[계좌번호 : %s, 예금주 : %s] 잔액 : %d 개설일자 %s\n",accountNumber, accountName
				,balance, accountDate);
	}
	
}
