package test18;

public class Rabbit {
	public String rabbitName;
	public int rank;
	
	public static void main(String[] args) {
		Rabbit[] r = new Rabbit[10];
		for(int i=0;i<r.length;i++) {
			int rank = (int)(Math.random() *10) +1 ;
			r[i].rank = rank;
		
		}  
		
		
		
	}
}
//오름차순 정렬
//내림차순 정렬
//메소드로 만들어서 호출 출력