package Dayone;

public class Assignmentoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		x += 5;//equivalent to x = x + 5
		System.out.println("After += 5: " + x);
		
		x -= 3;//equivalent to x = x - 3
		System.out.println("After -= 3: " + x);
		
		x *= 2; // equivalent to x = x * 2
		System.out.println("After *= 2: " + x);
		
		x /= 4; // equivalent to x = x / 4
		System.out.println("After *= 4: " + x);
		
		x %= 3; // equivalent to x = x % 3
		System.out.println("After %= 3: " + x);
		
		
		// ternary operator example 
		
		int score = 75;
		String  result = (score >= 60)	? "Pass" : "Fail" ;
		System.out.println("Result: " + result);
		
	}
 
}
