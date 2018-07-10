package test12;

public class FuncTest {

	public void printLoop(int start,int end) {
		for(int i = start ;i>=end;i--) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		FuncTest ft = new FuncTest();
		ft.printLoop(10, 1);
		ft.printLoop(12, 3);
		ft.printLoop(120, 100);
		
	
		}
		
		
	}

