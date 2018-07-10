package test09;

public class Son extends Father {
	
	@Override
	public void test() {
		this.run();
		super.test();
	}
	
	
	
	public static void main(String[] args) {
		Son s = new Son();
		s.test();
		
	}
}
