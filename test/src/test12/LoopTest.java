package test12;

public class LoopTest {

	public static void main(String[] args) {
		
		int[] arrNum = new int[10];
	    for(int i=0;i<arrNum.length;i++) {
		arrNum[i] = (i+1)*3;
			
		}
		for(int i=0;i<arrNum.length;i++ ) {
			System.out.println("arrNum[" + i + " ] = " + arrNum[i]) ;
		}
	}
}
