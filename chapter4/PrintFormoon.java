package ch04;

public class PrintFormoon {

	public static void main(String[] args) {
		for(int x=2; x<=9; x++) {
			System.out.println("****구구단" + x + "단****");
			for(int y=1; y<=9; y++) {
			System.out.println(x+"곱하기"+y+"="+(x*y));
			}
		}
	}

}
