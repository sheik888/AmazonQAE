package Dayone;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening conversion (implict)
		int myInt = 9;
		double myDouble = myInt; //automatic conversion int to double
		System.out.println("int: " + myInt);
		System.out.println("double after widening: " + myDouble);
		// narrowing conversion (emplicit casting)
		double anotherDouble = 9.78;
		int anotherInt = (int) anotherDouble;  //manual casting double to int
        
		
		System.out.println("double: " + anotherDouble);
		System.out.println("int after narrowing: " + anotherInt);
		
		//Overflow example 
		byte smallByte = (byte) 200; // byte range is -128 to 127
		System.out.println("Overflow example: " + smallByte);
		
		//character to int conversion
		char myChar = 'A';
		int charToInt = myChar;
		System.out.println("char 'A' as int: "+ charToInt);
		
	}

}
