package test12;

public class LoopTest2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
		arr[i] = (i+1) *4;
	}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr ["+ i + " ]=" + arr[i]);
		}
}
}