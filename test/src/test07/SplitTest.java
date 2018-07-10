package test07;

import java.util.Scanner;

public class SplitTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로 구분하여 입력하여주세요.");

		String pointStr = scanner.nextLine();
		scanner.close();

//		System.out.println(pointStr);
		
		String[] pointStrs = pointStr.split(",");
		
		int i;
		for (i = 0; i < pointStrs.length; i++) {
			System.out.println((i + 1) + "번째 학생 : " + pointStrs[i]);
		}
		
	}
}
