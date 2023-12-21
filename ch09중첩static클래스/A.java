package ch09중첩static클래스;

public class A {
	
	static class B{
		void methodB() {
			System.out.println("methodB실행");
		}
	}
	
	B field1 = new B();
	static B field2 = new B();
	
	A(){
		B b = new B();
	}
	
	void method1() {
		B field1 = new B();
	}
	
	static void method2() {
		B field2 = new B();
	}

}
