package Dayone;

public class operatorprecendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = 5 + 3 * 2; //Multiplication before addition
		int result2 = (5 + 3) * 2;//parentheses change order 
	boolean result3 = 5 > 3 && 2 < 4 || 1 == 0;
	System.out.println("5 + 3 * 2 = " + result1);
	System.out.println("(5 + 3) * 2 = " + result2);
	System.out.println("5 > 3 && 2 < 4 || 1== 0= " + result3);
	
	
	//complex expression
	
	int a = 2, b =3,c = 4;
	int complexresult = a++ * --b + c / a;
	System.out.println("a++ * --b + c / a = " + complexresult);
	
	
	}
	

}
