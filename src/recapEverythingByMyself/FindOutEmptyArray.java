package recapEverythingByMyself;

public class FindOutEmptyArray {

	public static void main(String[] args) {

		int a[]=new int [3];
		
		a[0]=1;
		a[2]=2;
		
		for(int i=0;i<a.length; i++) {
			if(a[i]==0) {
				System.out.println(i);
			}
			
		}
	}

}
