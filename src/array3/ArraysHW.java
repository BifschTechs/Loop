package array3;

import java.util.Arrays;

public class ArraysHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double [] db= new double [200];
	double sum= 0;
	double count=0;
	double average=0;
	for(double i =0; i<=200; i++) {
		sum=sum+i;
		
			if(i%2==0) {
				System.out.println("Even numbers: " +i);
				System.out.println("Average of even numbers: " + sum/i);
			
	Arrays.sort(db);
	}
	//System.out.println(sum);
	//System.out.println(Arrays.toString(db));
	System.out.println(db.length-1);
}
}
}