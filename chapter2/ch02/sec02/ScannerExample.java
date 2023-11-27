package ch02.sec02;

import java.util.Scanner;

public class ScannerExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("x값을 입력하세요:");		
		String str = scanner.nextLine();
		int x = Integer.parseInt(str);
		
		System.out.println("x의 값은" + x + "입니다");
		
		
		int y = 365;
		int z = 100;
		System.out.println((double)y/z);
	}

}
