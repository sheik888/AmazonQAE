package FlowControlLab;

public class WhieLoopDemo {
	
	public static void main(String[] args) {
		
		//whilel
		int count = 1;
		while (count <=5) {
			
			
			
			
			System.out.println("count: " + count);
			count++;
			
		}
		//while with condition 
		int number =1234;
		int digits =0;
		int temp = number;
		
		while (temp !=0) {
			temp /= 10;
			digits ++;
			
		}
		
		System.out.println(number + " has " + digits + " digits");
		
	}

}
//console

//count: 1
//count: 2
//count: 3
//count: 4
//count: 5
//1234 has 4 digits