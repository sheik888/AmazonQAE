package Dayone;

public class reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1234,reversed =0;
System.out.println("Original Number: " + num);
// run loop until num becomes 0
 while (num !=0){
	 // get last digit  from num 
	 int digit = num % 10;
	 reversed = reversed * 10 + digit;
	 
	 
	 //remove the last digit from num 
	 num/= 10;
	 
		 
 }
 System.out.println("Reversed Number: " + reversed);
 
	}

}
