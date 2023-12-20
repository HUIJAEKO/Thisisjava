package ch07상속;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "date1";
		parent.method1();
		parent.method2();
		
		Child child = (Child) parent;
		
		child.field2 = "date2";
		child.method3();
		
		
	}

}
