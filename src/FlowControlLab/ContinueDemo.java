package FlowControlLab;

public class ContinueDemo {

	
	public static void main(String[] args) {
		//skipping iteration 
		for (int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;
				
			}
			System.out.println(i);
		}
		//printing odd numbers
		for (int i=1;i<=10; i++) {
			if(i%2==0) {
				continue;
				}
			System.out.println(i + " ");
			}
	}
}
//console
//1
//2
//4
//5
//1 
//3 
//5 
//7 
//9 
