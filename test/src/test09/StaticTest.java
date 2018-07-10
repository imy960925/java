package test09;

public class StaticTest {
	static int numSt = 10;
	int num = 20;
	
	static int sum(int a, int b) {
		int re = a + b;
		return re;
	}
	
	public static void main(String[] args) {
//		Test t = new Test();
//		t.chNum();
//		System.out.println(StaticTest.numSt);
		
		int result = sum(1, 5);
		System.out.println( result );
		
	}
}
