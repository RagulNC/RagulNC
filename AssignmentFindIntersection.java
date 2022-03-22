package week1.day1;

import java.util.Arrays;

public class AssignmentFindIntersection {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		//System.out.println(arr.length);
		int air[] = {0,9,8,7,6,5,4};
		Arrays.sort(arr);
		Arrays.sort(air);
		for (int i = arr[0];i<arr.length;i++) {
			
			for (int j = air[0];j<air.length;j++) {
				 
				if (arr[i]==air[j]) {
					System.out.println(arr[i]);
				}
			}
			
		}
		
	}
	

}
