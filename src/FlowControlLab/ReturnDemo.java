package FlowControlLab;

public class ReturnDemo {
	
	
	public static void main(String[] args) {
		System.out.println("Before method call");
		 printMessage();
		System.out.println("After method call");
		
		int result= addNumbers(5, 7);
		System.out.println("Sum:" + result);
	}
		static void printMessage() {
		System.out.println("Inside method");
		return;//optional for void methods
		
	}
static int addNumbers(int a, int b) {
	return a+b;
	
}
}
//Before method call
//Inside method
//After method call
//Sum:12
