package array2;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {

		int[] numbers= {99,12,2434,9989,1,43,454};
		
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 454)+" is index of 454");
		System.out.println(Arrays.binarySearch(numbers, 2)+" is index of 2");
		
		
	}

}
