package arrayarrayTrenkaOtkonTemalar;

import java.util.Arrays;

public class Hmwrkrecap {

	public static void main(String[] args) {
		
		double num[] =new double [200];
		
		double sum =0;
		double numbers=0;
		double avg=0;
		
		for(int i=0;i<num.length; i++) {			
			num[i]=i;

			if(num[i]%2==1) {
				numbers++;
				sum = sum+num[i];
				avg=sum/numbers;
				
			}
				
				
				
			
				
			}System.out.println("all numbers "+numbers);
			 System.out.println("total "+sum);
			 System.out.println("avg "+avg);
			 
				
	
		
	}
}
