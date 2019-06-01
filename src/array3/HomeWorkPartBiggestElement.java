package array3;

public class HomeWorkPartBiggestElement {

	public static void main(String[] args) {

		int[]numbers= {2,23,22,20,19,18,170,194,211,14,11};
		
		int largestNumber=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(largestNumber< numbers[i]) {
				largestNumber=numbers[i];
				
			}
			
			
			
			
			
		}
		System.out.println(largestNumber);
	}

}
