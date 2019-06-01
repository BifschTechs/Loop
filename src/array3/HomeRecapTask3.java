package array3;

import java.util.Arrays;

public class HomeRecapTask3 {

	public static void main(String[] args) {

		int [] numbers =new int[25];
		
		
		for(int i=0; i<numbers.length; i++) {
			
			
			
			
			numbers[i]=i;
		}
		System.out.println(Arrays.toString(numbers));
		int[] tempNumbers = Arrays.copyOf(numbers, numbers.length);
		int [] emptyNumbers = new int [25];
		int n=0;
		for(int i=numbers.length-1; i>=0; i--) {
			emptyNumbers[n]=numbers[1];
			n++;		}
	}
	System.out.println("This is a reversed array of int: "+Arrays.toString(emptyNumbers));

}
