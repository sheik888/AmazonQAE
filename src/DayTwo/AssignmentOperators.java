package DayTwo;

public class AssignmentOperators {
public static void main(String[] args) {
	int x =10;
	x += 5;
	System.out.println("After += 5:" + x);
	
	x -= 3;
	System.out.println("After -= 3:" + x);
	
	x *= 3;
	System.out.println("After *= 2:" + x);
	
	x /= 3;
	System.out.println("After /= 4:" + x);
	
	x %= 3;
	System.out.println("After %= 3:" + x);
	
	
	int score = 75;
	String result = (score >= 60) ? "Pass"	: "Fail";
	System.out.println("Result:" + result);
	

}
}
