package multiDimension;

public class newAgesCorrect {

	public static void main(String[] args) {

		int [] numbers = {1,2,3,4,5,7,8,9};
		
		int N=numbers.length+1;
		
		int total=(N*(N+1))/2;
		System.out.println("total is "+ total);
		
		int actual=0;
		for(int i=0; i<numbers.length; i++) {
			actual+=numbers[i];
			
		}
		System.out.println(total-actual);
	}

}
