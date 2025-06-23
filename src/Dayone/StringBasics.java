package Dayone;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "World";
		
		//concatenation
		String result = str1 + " " + str2;
		System.out.println("Concatenation:" + result);
		 
		//length 
		System.out.println("length of str1:" + str1.length());
		//character at index
		System.out.println("character at index 1 in str1:" + str1.charAt(1));
		// SUBSTRING
		System.out.println("Substring of str2 from index 1:" + str2.substring(1));
//comparison 
		System.out.println("str1 equals 'hello';" + str1.equals("hello"));
        System.out.println("str1 equals idnore case 'hello':" + str1.equalsIgnoreCase("hello") );
        // searching 
        System.out.println("index of 'e' in str1:" + str1.indexOf('e'));
        System.out.println("contains 'or1' in str2:" + str2.contains("or1") );
        //case conversion
        System.out.println("uppercase str1:" + str1.toUpperCase());
System.out.println("lowercase str2:" + str2.toLowerCase());
//trimming
String str3 = "  Trim me  ";
System.out.println("Trimmed:'" + str3.trim() + "'");
//replacement
System.out.println("replace '1' with 'p' in str1:" + str1.replace('1', 'p'));

}
}