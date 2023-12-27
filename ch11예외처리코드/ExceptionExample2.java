package ch11예외처리코드;

public class ExceptionExample2 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null};
		
		for(int i=0; i<=array.length; i++) {
			try{System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("항목 수가 부족합니다.");
			}catch(NullPointerException|NumberFormatException e) {
				System.out.println("문자가 없거나 숫자 변환이 불가합니다.");
			}finally {
				System.out.println();
			}
		}
	}

}
