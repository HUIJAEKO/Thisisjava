package ch04;

public class SwitchPractice {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		
		System.out.println("[현재 시간은" + time + "시 입니다]");
			switch(time){
				case 8:
					System.out.println("8시입니다");
					break;
				case 9:
					System.out.println("9시입니다");
					break;
				case 10:
					System.out.println("10시입니다");
					break;
				default:
					System.out.println("11시입니다");
					break;
			}
	}

}
