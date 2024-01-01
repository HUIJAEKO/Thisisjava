package ch13제네릭예제;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("홍길동", 30);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<String, Integer>("홍길동", 30);
		Integer childAge = Util.getValue(childPair, "삼순");
		System.out.println(childAge);
		
	}

}
