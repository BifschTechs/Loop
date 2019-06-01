package recapEverythingByMyself;

public class ArrayDescending {

	public static void main(String[] args) {

		
		int a[]= new int [7];
		
		a[1]=1;
		a[3]=3;
		a[2]=2;
		a[4]=4;
		a[0]=0;
		a[6]=6;
		
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
			
		}
	}

}
