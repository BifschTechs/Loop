package multiDimension;

public class againInterviewQuestion {
	
	public static void main(String[] args) {
		
		int [] sAge= {9,8,6,4,4,7,8,1};
		
		for(int i=0;i<sAge.length;i++) {
			
		
			
			for(int k=i+1; k<sAge.length; k++) {
				
				if(sAge[i]==sAge[k]) {
					
					System.out.println("Duplicate nums are "+sAge[i]);
				}
			
		
			}
		}
		
		
		
	}

}
