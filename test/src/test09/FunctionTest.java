package test09;

public class FunctionTest {

	static void print(String str) {
		System.out.println(str);
	}
	
	static void sum(int num, int num2) {
		System.out.println(num + num2);
	}
	
	static int getNum() {
		return 0;
	} 
	
	public static void main(String[] args) {
		
		print("abcd");
		sum(2, 6);
		
		String str = String.valueOf(getNum());
		System.out.println(str);
	
	}
}
