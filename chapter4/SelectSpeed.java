package ch04;

import java.util.Scanner;

public class SelectSpeed {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------속도 선택-------");
			System.out.println("--1.증속 2.감속 3.중지--");
			System.out.println("---------------------");
			System.out.print("숫자 입력:");
				
			String number = scanner.nextLine();
		
			if(number.equals("1")){
				speed++;
				System.out.println("현재 속도는" + speed + "입니다.");
			}else if(number.equals("2")) {
				speed--;
				System.out.println("현재 속도는" + speed + "입니다.");
			}else if(number.equals("3")) {
				run = false;
			};
		}
			
		System.out.println("프로그램을 종료합니다.");
		
			
	}

}
