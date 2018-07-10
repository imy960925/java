package test10;

public class Calc {

	public void select(String op, int a, int b) {
		if(op.equals("+")) {
			add(a, b);
		} else if(op.equals("-")) {
			sub(a, b);
		} else if(op.equals("*")) {
			multi(a, b);
		} else if(op.equals("/")) {
			divide(a, b);
		} else {
			System.out.println("알수없는 연산자입니다.");
		}
	}
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	
		
	}


