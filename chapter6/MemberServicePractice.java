package ch06Practice;

public class MemberServicePractice {

	public static void main(String[] args) {
		MemberService member = new MemberService();
		
		boolean result = member.login("hon", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다");
			member.logout("hong");
		}else {
			System.out.println("id 또는 password가 일치하지 않습니다");
		}
		
		
	}

}
