package test21;

import java.util.ArrayList;

public class ListTest2 {

	public static void man(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=0;i<6;i++) {
			int a = (int) (Math.random()*45) + 1 ;	
		al.add(a); 
		
			
		}
		for(int a :al) {
			System.out.println(a);
		}
	}
}
