package Dayone;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		long factorial = 1;
		for(int i = 1; i <= num; i++)
		{ 
			//factorial = factorial * i;
			factorial *= i++;
		
			
		}
		System.out.println(num + " : " + factorial);
		

	}

}
