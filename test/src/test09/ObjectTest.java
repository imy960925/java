package test09;

public class ObjectTest{
	int num = 3;
	boolean bool = true;
	
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
		System.out.println(bool);
		test();
	}
	
	public static void main(String[] args) {
		ObjectTest objt = new ObjectTest();
		
		objt.test();
		
	}
}
