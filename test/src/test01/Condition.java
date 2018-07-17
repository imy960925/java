package test01;

public class Condition {
	

	public static void main(String[] args) {
		boolean bool = false;
		
		
		if (bool) {
			System.out.println("1과 1은 같다.");
		} else {
			System.out.println("1과 1이 다르다고?");
		}
		
		int age = 23;
		
		if (age >= 40) {
			System.out.println("40대 군요.");
		} else if (age >= 30) {
			System.out.println("30대 군요.");
		} else if (age >= 20) {
			System.out.println("20대 군요.");
		} else if (age >= 10) {
			System.out.println("10대 군요.");
		} else {
			System.out.println("어르신!!");
		}
		
		
	}
}
