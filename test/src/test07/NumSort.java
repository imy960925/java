package test07;

import java.util.Arrays;

public class NumSort {

	public static void main(String[] args) {
		int[] arrNum = new int[] {30, 20, 10, 70};
		
		int i, j;
		for (i = 0; i < arrNum.length - 1; i++) {
			for (j = i + 1; j < arrNum.length; j++) {
				if (arrNum[i] > arrNum[j]) {
					int temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}

//		Arrays.sort(arrNum);
		
		for (i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
