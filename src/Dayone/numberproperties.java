package Dayone;

public class numberproperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12;
		boolean isEven = (number % 2) == 0;
		boolean isPositive = number > 0;
		boolean divisibleBy3 = (number % 3) == 0;
		
		System.out.println(number + " is even: " + isEven);
		System.out.println(number + " is Positive: " + isPositive);
		System.out.println(number + " is divisibleBy3: " + divisibleBy3);

	}

}
