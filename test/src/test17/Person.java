package test17;

public class Person extends Human {
	Person() {
		super("홍길동", 10, 6);

	}
	public void printHuman() {
		System.out.println("l");
		super.printHuman();
		
	}

	public static void main(String[] args)  {
		Person p = new Person();
		p.printHuman();
		
		
	}
}
