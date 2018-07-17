package test19;

public class Exec {
public static void eat(Action P) {
	P.eat();
}
public static void main(String[] args) {
	Action act = new Animal();
	act = new Person();
	eat(act);
	eat(new Animal());
	eat(new Person());
	
}
}
