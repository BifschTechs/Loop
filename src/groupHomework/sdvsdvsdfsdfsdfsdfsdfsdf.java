package groupHomework;

import java.util.Arrays;

public class sdvsdvsdfsdfsdfsdfsdfsdf {

	public static void main(String[] args) {
		
		
		
		int a[]= {1,2};
		int b[]= {3,5};
		
		int la=a.length;
		int lb=b.length;
		
		int [] result=new int [la+lb]; 
		
		System.arraycopy(a, 0, result, 0,la);
        System.arraycopy(b, 0, result, la, lb);

System.out.println(Arrays.toString(result));
		
	/*int num[] = {2,5,9,3,1,44,98,11,7};
			
	
	int min=num[0];
	
	for(int i=0; i<num.length;i++) {
			if(num[i]<min) { 
				
				min = num[i];
				
	}System.out.println(min);
		
				
				
				
				
		
		/*int nums[]= {3,6,8,3,2,7,9,9};
		int duplicate=0;
		
		for(int i=0; i<nums.length;i++) {
			
			for(int k=i+1;k<nums.length; k++) {
				if(nums[i]==nums[k]) {
					duplicate=nums[k];
					
				}					

				
			}*/
				

		int numers[]= new int[4];
		
		numers[0]=1;
		numers[1]=2;
		numers[2]=5;
		numers[3]=34;
		
		int max=numers[0];
		
		for(int i=0; i<numers.length;i++) {
				    	
			if(numers[i]< max) {
				max=numers[i];
			}
		}System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
	
}

