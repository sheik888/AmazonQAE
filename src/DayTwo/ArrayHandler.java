package DayTwo;

public class ArrayHandler {
public static void main(String[] args) {
	int[] numbers = {1, 2, 3};
	try {
		System.out.println(numbers[5]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index! Max index is " + (numbers.length-1));
		
	}
}
}
