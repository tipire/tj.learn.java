package tj.learn.java;

class Animal{
	
	 Animal() {
		System.out.println("animal is created");
	}
}


public class Circle extends Animal{
	Circle() {
		super();
		System.out.println("Circle is created");
	}
	public static void main(String[] args) {
		Circle cc = new Circle();
		
	}
}
