package test21;
//1. 반복문으로 1부터 10까지 찍는 소스를 작성하세요
//(클래스 main함수까티 써야 합니다.)
public class test {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// 2. 반복문으로 10부터 1까지 짝수만 찍는 코드를 작성하세요.

		for (int i = 10; i <= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 3. 반복문으로 10부터 1까지 홀수만 찍는 코드를 작성하세요.
		for (int i = 10; i <= 1; i--) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
