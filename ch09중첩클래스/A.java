package ch09중첩클래스;

public class A {
	public class B{
		public void methodB() {
			System.out.println("methodB");
		}
	}	
	
	A(){
		B b =  new B();
		b.methodB();
	}
	
	void methodA(){
		B b =  new B();
		b.methodB();
	}
	
	
	
}
