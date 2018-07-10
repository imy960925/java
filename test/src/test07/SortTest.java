package test07;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		
		String[] arrStr = str.split(",");
		int[] arrNum = new int[arrStr.length];
		
		int i, j;
		for (i = 0; i < arrStr.length; i++) {
			arrNum[i] = Integer.parseInt(arrStr[i]);
		}
		
		for (i = 0; i < arrNum.length - 1; i++) {
			for (j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] < arrNum[j]) {
					int temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}
		
		for (i = 0; i < arrStr.length; i++) {
			System.out.println(arrNum[i]);
		}
		
	}
}
