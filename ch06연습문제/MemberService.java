package ch06연습문제;

public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 하셨습니다.");
	}
}
