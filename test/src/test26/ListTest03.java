package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {

	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i<5;i++) {
		System.out.println("나이를 입력해주세요");
		int age = Integer.parseInt(scan.nextLine());
		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();
		pList.add(new Person(name,age));
		}
		
		for(Person p:pList) {
			System.out.println(p);
		}
			
}
	}
	
