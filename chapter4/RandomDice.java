package ch04;

public class RandomDice {

	public static void main(String[] args) {
		int number = (int)(Math.random()*6)+1;
		
		if(number==1) {
		System.out.println("1입니다.");
		}else if(number==2) {
			System.out.println("2입니다.");
		}else if(number==3) {
			System.out.println("3입니다.");
		}else if(number==4) {
			System.out.println("4입니다.");
		}else if(number==5) {
			System.out.println("5입니다.");
		}else {
			System.out.println("6입니다.");
		}
	}

}
