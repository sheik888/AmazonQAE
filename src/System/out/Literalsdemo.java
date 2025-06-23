package System.out;

public class Literalsdemo {
	public static void main(String[] args) {
		// Integer lietrals in different formats
		
		int decimal =100;
		int octal =0144;// starts with 0
		int hex =0*64; //starts with0x
	
		  
		
		System.out.println("Decimal 100: " + decimal);
		System.out.println("Octal 0144: " + octal);
		System.out.println("Hexadecimal 0x64: " + hex);
		
		 
		
		// Floating point literals 
		double sceintific = 1.234e2; //1.234 x 10^2 =123.4
		System.out.println ("Scientific notation 1.234e2: ");
		
		// Character and string literlas 
		char letter = 'J';
		
		System.out.println("Character: " + letter);
		
		//Esacape sequence 
		
		System.out.println("Newline: Hello \nWorld");
		System.out.println("Tab: Hello\tWorld");
		System.out.println("Backslash : c: \\Program Files\\Java");
		System.out.println("Double quote : \"java\"");
		
		
		
	
	

}
}