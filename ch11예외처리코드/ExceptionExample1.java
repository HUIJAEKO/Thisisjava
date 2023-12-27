package ch11예외처리코드;

public class ExceptionExample1 {
	public static void printLength(String data) {
		try{
			int result = data.length();
			System.out.println(result);
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("마무리\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("시작\n");
		printLength(null);
		printLength("안녕안녕");
		System.out.println("종료");
		
	}

}
