package test11;

public class Student {

	private String clazz;
	private String name;
	private int grade;
	
	public void sd(String clazz, String name, int grade) {
		
		this.clazz = clazz;
		this.name = name;
		this.grade = grade;
	}
	public void sd() {
		System.out.println(clazz);
		System.out.println(name);
		System.out.println(grade);
		
	}
}
