package ch06oop;

public class ex1 {

	public static void main(String[] args) {
		
		ex2 person = new ex2("gml","Korea", 21);
		ex2 person2 = new ex2("wo", "France", 23);
		ex2 person3 = new ex2("ko", "UK", 20);
		
		System.out.println(person.name);
		System.out.println(person.nation);
		System.out.println(person.age);
		System.out.println();
		
		System.out.println(person2.name);
		System.out.println(person2.nation);
		System.out.println(person2.age);
		System.out.println();
		
		System.out.println(person3.name);
		System.out.println(person3.nation);
		System.out.println(person3.age);
	}

}
