package Dayone;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//decimal number
		int num = 19;
		System.out.println("Decimal to Binary");                //console 
		// call method to convert to binary 
		
		String binary = convertDecimalToBinary(num);
		System.out.println("Binary of" +num + " = " + binary);
		
	}

	public static String convertDecimalToBinary(int n) {
		StringBuilder binary = new StringBuilder();
		int step =1;
		
		while (n!=0) {
			int remainder = n % 2;
			System.out.println("Step " + step+++ ": " + n + "/2");
			System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
			binary.insert(0,remainder);
	n =	n / 2;
			
			
		}
		return binary.toString();
		
	}
}
//console
//Decimal to Binary
//Step 1: 19/2
//Quotient = 9, Remainder = 1
//Step 2: 9/2
//Quotient = 4, Remainder = 1
//Step 3: 4/2
//Quotient = 2, Remainder = 0
//Step 4: 2/2
//Quotient = 1, Remainder = 0
//Step 5: 1/2
//Quotient = 0, Remainder = 1
//Binary of19 = 10011
