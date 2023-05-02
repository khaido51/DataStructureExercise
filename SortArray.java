package cm4DataStructureDay1;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 0, 0, 1, 2, 2, 1};
		

		sortingArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("BigO = O(n)");
		
	}
	
	public static void sortingArray(int[] arr) {
		
		int low = 0;
		int high = arr.length -1;
		int mid = 0;
		
		while(mid <= high) {
			if(arr[mid] == 0) {
				arr[mid] = arr[low];
				arr[low] = 0;
				low++;
				mid++;
			}
			else if(arr[mid] == 1) {
				mid++;
			}
			else {
				arr[mid] = arr[high];
				arr[high] = 2;
				high--;
			}
			
		}
	}
}
