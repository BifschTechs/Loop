package multiDimension;

public class MultiArray2 {

	public static void main(String[] args) {

		int num[][]=new int [4][3];
		
		num[0][0]= 18;			
		num[0][1]= 21;
		num[0][2]= 19;
		
		num[1][0]= 22;			
		num[1][1]= 30;
		num[1][2]= 24;
		
		num[2][0]= 17;			
		num[2][1]= 28;
		num[2][2]= 23;
		
		num[3][0]= 24;			
		num[3][1]= 33;
		num[3][2]= 31;


		for(int i=0; i<num.length; i++) {
			
			for(int k=0;k<num[i].length; k++) {
				
				System.out.println(num[i][k]);
				
			}
		}
		
		
	}

}
