package test09;

public class ObjectTest{
	int num = 3;
	boolean bl = true;
	
	int getNum() {
		return num;
	}
	
	String getStr() {
		return "abcd";
	}

	void test() {
		int num = 10;
	
		System.out.println(this.num);
		System.out.println("난 Obj의 테스트 함수!");
	}
	
	void test2() {
		System.out.println(num);
		System.out.println(bl);
		test();
	}
	
	public static void main(String[] args) {
		ObjectTest objt = new ObjectTest();
		
		objt.test();
		
	}
}
