package arrayPracticeDay;

import java.util.Arrays;

public class MultiDimTableExample {

	public static void main(String[] args) {

		int[] tableNumber =new int [1];
		
		tableNumber[0]=3;
		
		System.out.println(tableNumber.toString()); //hashcode of your array
		System.out.println(Arrays.toString(tableNumber)); //will print the values of 
		
		
		
		
		
		
		
		
		int [] studentNumber = {4,3,6,10,7};
		
		System.out.println(Arrays.toString(studentNumber));
		Arrays.sort(studentNumber);
		System.out.println(Arrays.toString(studentNumber));
		
	
		
		
		
		
		
		
		
		String [] stateName = {"IL", "Claifornia", "Wisconsin"};
		
		Arrays.sort(stateName);
		
		System.out.println(Arrays.toString(stateName));
		
		
		
		
		
		
		
		
		
		
		
		String[] numName= {"101", "1001", "900"};
		
		Arrays.sort(numName);
		System.out.println(Arrays.toString(numName));
		
		String [] state3=numName;
		
		System.out.println(state3.equals(numName));
		
		
		
	}

}
