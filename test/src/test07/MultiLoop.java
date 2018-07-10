package test07;

public class MultiLoop {

	public static void gop(int start, int end) {
		int i, j;

		for (i = start; i <= end; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		gop(2, 9);
		
	}
}
