package array3;

public class HomeWorkRecapSmalestElement {

	public static void main(String[] args) {
		
		
int[]numbers= {2,23,22,1,20,19,18,170,194,211,14,11};
		
		int smallestNumber=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(smallestNumber >   numbers[i]) {
				smallestNumber=numbers[i];
				
			}
			
			
			
			
			
		}
		System.out.println(smallestNumber);
	}
}


