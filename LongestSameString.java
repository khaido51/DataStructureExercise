package cm4DataStructureDay1;

import java.util.Arrays;

public class LongestSameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"flower", "flow", "flight"};
		
		
		System.out.println("The longest common prefix is: " + findCommonPrefix(arr));
		System.out.println("BigO = O(n^2)");
	}
	
	public static String findCommonPrefix(String[] arr) {
		if (arr == null || arr.length == 0) return "";
		for(int i = 0; i < arr[0].length(); i++) {
			for(int j = 1; j < arr.length; j++) {
				if(i == arr[j].length() || arr[j].charAt(i) != arr[0].charAt(i)) {
					 return arr[0].substring(0, i);
				}
				
			}
		}
		return arr[0];
	
	}

}
