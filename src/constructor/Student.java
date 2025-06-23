package constructor;

public class Student {
	String name;
	int age;
	
	//default constructor
	
	
	public Student() {
		this .name = "unknown";
		this.age = 0;
		
		
	}
	//perameterized constructor 
	public Student(String name, int age) {
		this.name = name;
		this.age =  age;
		
	}

	public static void main(String[] args) {
		Student student1 = new Student();  // use default constructor
		
		Student student2 = new Student( "Alice", 20);  // use default constructor
		
		System.out.println("student 1: " + student1.name + ", " + student1.age);
		System.out.println("student 2: " + student2.name + ", " + student2.age);
		
		

	}

}
