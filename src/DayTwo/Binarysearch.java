package DayTwo;

public class Binarysearch {
	public static int binarySearch(int[] arr, int target) {
		if (arr== null || arr.length == 0) {
			return -1;
			
		}
		int left = 0;
		int right = arr.length-1;
		while (left <= right) {
			
			int mid = left + (right-left);
			
			
			if (arr[mid] == target) {
				return mid;
				
			}
		
	if (arr[mid] < target) {
		left = mid + 1;
		}
	else {
		right = mid -1;
		
	}
	}
		
		return -1;	

	}
			public static void main(String[] args) {
				int[] arr = {1, 3, 5, 7, 9};
				System.out.println("Searching for 5: " + binarySearch(arr,5));
				System.out.println("Searching for 4: " + binarySearch(arr,4));


		


}
}