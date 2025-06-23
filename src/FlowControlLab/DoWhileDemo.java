package FlowControlLab;

import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		
		
		int i=1;
		do {
			System.out.println("count: " + i);
			i++;
		}while (i<=5);
		// menu system example
		
		Scanner scan=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. option 1");
			System.out.println("2. option 2");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			choice = scan.nextInt();
			
			
			
			switch(choice) {
			case 1 -> System.out.println("option 1 selected");
			case 2 -> System.out.println("option 2 selected");
			case 3 -> System.out.println("Exiting...");
			default-> System.out.println("Invalid choice");
			
			}
			
			
		}while(choice != 3);
	
}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


