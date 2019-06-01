package multiDimension;

public class newAges {

	public static void main(String[] args) {
		//write the code to find the missing number from the array
		//to find the sum of the N number . formula is sum=(N+(N+1/2)-actual;

		int [] numbers = {1,2,3,4,5,7,8,9};
		int sum = 0;
		int sum1=0;
		int result=0;
		
		
		for(int i=0; i<numbers.length; i++) {
			
			sum = sum+numbers[i];
			
		}System.out.println(sum);
		
		sum1=((numbers.length-1)+((numbers.length)+1))/2;
		
		result= sum1-sum;
	
		System.out.println(result);
	}

}
