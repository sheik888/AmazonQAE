package constructor;

public class Rectangle {
	double length;
	double width;
	
	// no -arg constructor (create a unit square
	
	public Rectangle() {
		this.length = 1.0;
		this.width = 1.0;
		
	}
//constructor for sqare
	
	public Rectangle(double side) {
		this.length = side;
		this.width = side;
	}
	//constructor for rectangle
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return length * width;
	}
	
		public static void main(String[] args) {
			Rectangle rect1 = new Rectangle();  // unit square
			Rectangle rect2 = new Rectangle(5.0); //square
			Rectangle rect3 = new Rectangle(4.0, 6.0); //rECTANGLE
			
		System.out.println("Area 1 : " + rect1.calculateArea());
		System.out.println("Area 2 : " + rect2.calculateArea());
		System.out.println("Area 3 : " + rect3.calculateArea());
		
			
	}
	

	}


