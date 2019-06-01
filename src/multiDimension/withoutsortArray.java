package multiDimension;

import java.util.Arrays;

public class withoutsortArray {

	public static void main(String[] args) {

		//sort an array without using Arrays.sort()
		
		int [] sortNumber = {9,8,6,4,5,7,3,1};
		
		for(int i=0;i<sortNumber.length;i++) {
			
			for(int k=i+1; k<sortNumber.length; k++) {
				
				
				int temp=0;
				if(sortNumber[i]>sortNumber[k]) {
					temp=sortNumber[i];//temp=9
					sortNumber[i]=sortNumber[k];//{8,8,6,4,5,7,3,1}
					sortNumber[k]=temp;//{8,9,6,4,5,7,3,1}
					
					
					
				}
				
				
			}
			
		}System.out.print(Arrays.toString(sortNumber));
		}

}
