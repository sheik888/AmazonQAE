package FlowControlLab;

public class BreakDemo {
	
	
	public static void main(String[] args) {
		
		//breaking loop
		for(int i=1; i<=10;i++) {
			if (i==5) {
				break;
			}
	
		
		System.out.println(i);
		}
		//breaking nested loops with lables 
	outerLoop:
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++) {
			System.out.println(i + "," + j);
			if (i==2 && j==2) {
				break outerLoop;
			}
			}	
	}
}
}
//console
//1
//2
//3
//4
//1,1
//1,2
//1,3
//2,1
//2,2