package test10;

public class FuncTest {

	public void add(int a, int b) {
		System.out.println("int 더하기 : " + (a + b));
	}
	
	public void add(long a, long b) {
		System.out.println("long 더하기 : " + (a + b));
	}
	
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.add(1, 6);
		ft.add(1L, 152L);
	}
}
