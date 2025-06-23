package Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		//three ways to initialize arrays
		
		int[] arr1 = new int[5]; // declaration with size 
		int[] arr2 = {10, 20, 30, 40, 50};      //declaration with initialization
		int[] arr3 = new int[] {5, 10, 15};    //alternative initialization

		
		//array traversal techniques
		System.out.println("for loop :");

	for (int i= 0; i < arr2.length; i++)
		
		
		System.out.println("arr2[" + i + "] = " + arr2[i]);

	
	System.out.println("\nEnhanced for loop :");
	for (int num : arr3) {
		System.out.println(num);
	}
	System.out.println("\nWhile loop :");
	int i = 0;
	while (i < arr1.length) {
		arr1[i] = (i + 1) * 100; ///initialize values
		System.out.println(arr1[i]);
		i++;
		

	}
	}
}
