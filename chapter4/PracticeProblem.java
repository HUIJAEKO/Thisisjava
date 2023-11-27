package ch04;

import java.util.Scanner;

public class PracticeProblem {
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);

		int money = 0;

		boolean run = true;
		
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.print("선택>");
			
			String str = scanner1.nextLine();
			
			if(str.equals("1")) {
				System.out.print("예금액>");
				String save = scanner2.nextLine();
				money+=Integer.parseInt(save);
			}else if(str.equals("2")) {
				System.out.print("출금액>");
				String use = scanner3.nextLine();
				money-=Integer.parseInt(use);
			}else if(str.equals("3")) {
				System.out.println("잔고>"+money);
			}else {
				System.out.println("프로그램 종료");
				run=false;
			}
		}

			
				
			
			
		
	}
}
