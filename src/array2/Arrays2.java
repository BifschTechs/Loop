package array2;

public class Arrays2 {

	public static void main(String[] args) {

		int [] num=new int[4];
		num[0]=12;
		num[2]=14;
		num[1]=13;
		num[3]=11;
		
		
		for(int i=num.length-1; i>=0; i--) {
			
			System.out.println("This is the element of index at "+i+" value is "+num[i]);
			
		}

		
		

	}

}
