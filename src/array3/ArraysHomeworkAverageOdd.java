package array3;

public class ArraysHomeworkAverageOdd {

	public static void main(String[] args) {

		double [] db= new double [15];
		
		
		double sumOfOdd=0;
		double count=0;
		double average=0;
		for(int i=0; i<=200; i++) {
			
			if(i%2==1) {
				sumOfOdd=sumOfOdd+i;
				count++;
				
			average=sumOfOdd ;
			}
			
			
	}System.out.println("Sum of Odd numbers "+sumOfOdd);
	System.out.println("Elements numbers total "+count);
	System.out.println("Average of Odd numbers are "+average);
	
	
	}
}
