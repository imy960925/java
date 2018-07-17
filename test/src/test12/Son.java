package test12;

public class Son extends Father {

	void work() {
		 System.out.println("난 개발일을 하지~");
		 super.work();
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}
