package DayTwo;

public class Grandparents {
	void grandparentsMethod() {
		System.out.println("Grandparent's  method");
	}
	}
class Parent extends Grandparents{
	void parentsMethod() {
		System.out.println("Parent's method");
	
}
}

class Child extends Parent {
	void childMethod() {
		System.out.println("child's method");
	}
}


