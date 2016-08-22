package com.psyprogramming;

import java.util.Scanner;

public class Bank {
	
	Scanner input = new Scanner(System.in);
	
	private final int deposit = 1;
	private final int withdraw = 2;
	private final int exit = 3;
	
	public void banking () {
		
		int money = 0;
		int selectMenu = 0;
		
		
		System.out.println("안녕하세요 00은행입니다.");
		System.out.println("예금주 명을 입력하세요.");
		String accountName = input.next();
		System.out.println("계좌번호를 입력하세요.");
		String accountNumber = input.next();
		System.out.println("개설일자를 입력 하세요.");
		String accountDate = input.next();
		
		System.out.println("입금 금액을 입력하세요");
		int balance = input.nextInt();
		
		System.out.println("계좌가 생성되었습니다.");
		
		Account account = new Account(accountName, accountNumber, accountDate, balance);
		
		
		while(true) {
			
			account.showMyMoney();
			System.out.println();
			
			System.out.println("업무를 선택하세요.");
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.종료");
			
			selectMenu = input.nextInt();
			
			if(selectMenu==deposit) {
				
				System.out.println("입금 금액을 입력하세요");
				money = input.nextInt();
				System.out.println(money+"원 입금 되었습니다.");
				account.receiptMoney( money);
			}
			else if(selectMenu==withdraw) {
				
				while(true) {
					
					System.out.println("출금 금액을 입력하세요");
					money = input.nextInt();
					
					if(account.getBalance()<money) {
						
						System.out.println("잔액이 모자랍니다. 출금 할 수 없습니다.");
						
					}
					else {
						
						System.out.println(money+"원 출금 되었습니다.");
						account.withdrawalMoney( money);
						break;
						
					}
					
				}
				
			}
			else if (selectMenu==exit) {
				System.out.println("안녕히 가세요.");
				break;
			}
			else {
				System.out.println("잘못 선택하셨습니다.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Bank().banking();
	}
}
