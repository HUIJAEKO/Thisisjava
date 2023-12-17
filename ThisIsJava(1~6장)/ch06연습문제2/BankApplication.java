package ch06연습문제2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean result = true;
		
		while(result) {
			System.out.println("-----------------------------");
			System.out.println("1계좌생성 2계좌목록 3예금 4출금 5종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
		
			int choose = scanner.nextInt();
		
			if(choose==1) {
				makeAccount();
			}else if(choose==2) {
				listAccount();
			}else if(choose==3) {
				saveAccount();
			}else if(choose==4) {
				minusAccount();
			}else if(choose==5) {
				result=false;
				System.out.println("프로그램 종료");
			}	
			
			System.out.println();
		}
	}


		private static void makeAccount() {
			System.out.println("------");
			System.out.println("계좌생성");
			System.out.println("------");
			
			System.out.print("이름:");
			String name = scanner.next();
			System.out.print("계좌번호:");
			String number = scanner.next();
			System.out.print("초기예금액:");
			int balance = scanner.nextInt();
			
			Account account = new Account(balance, name, number);
			
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i]==null) {
					accountArray[i]=account;
					System.out.println("계좌가 생성되었습니다.");
					break;
				}
			}
		}
		
		private static void listAccount() {	
			System.out.println("------");
			System.out.println("계좌목록");
			System.out.println("------");
			
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i]==null)break;
					System.out.println(accountArray[i].getName() + "," + accountArray[i].getNumber() + "," + accountArray[i].getBalance());
			}		
		}
			
		private static void saveAccount() {
			System.out.println("------");
			System.out.println("예금하기");
			System.out.println("------");
			
			System.out.print("계좌번호>");
			String number = scanner.next();
			
			System.out.print("예금액>");
			int balance = scanner.nextInt();
			
			Account account = findAccount(number);
						
			if(account == null) {
				System.out.println("계좌가 없습니다");
				}
			
			account.setBalance(account.getBalance() + balance);
			System.out.println("예금이 완료되었습니다. 잔액:" + account.getBalance());
		}

		private static void minusAccount() {
			System.out.println("------");
			System.out.println("출금하기");
			System.out.println("------");
			
			System.out.print("계좌번호>");
			String number = scanner.next();
			
			System.out.print("출금액>");
			int balance = scanner.nextInt();
			
			Account account = findAccount(number);
						
			if(account == null) {
				System.out.println("계좌가 없습니다");
				return;
				}
			
			if(account.getBalance() - balance < 0) {
				System.out.println("잔액이 부족합니다");
				return;
			}
			
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금이 완료되었습니다. 잔액" + account.getBalance());
	}


		private static Account findAccount(String number) {
			Account account = null;
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i]!=null) {
					if(accountArray[i].getNumber().equals(number)) {
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}
}
