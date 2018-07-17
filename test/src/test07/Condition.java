package test07;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.print("숫자1 입력 : ");
		int startNum = Integer.parseInt(scanner.nextLine());
		System.out.print("숫자2 입력 : ");
		int endNum = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		if (startNum > endNum) {
			int temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
	
		int i;                
		for(i = startNum; i <= endNum; i++) {
			System.out.println(i);
		}
	}

}
