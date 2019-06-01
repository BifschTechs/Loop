package recapEverythingByMyself;

public class ExersizeArrayForEach {

	public static void main(String[] args) {

		int a[]= new int[4];
		
		a[1]=1;
		a[2]=2;
		a[3]=555;
		a[0]=123;
		
		for(int loop: a){
			System.out.println(loop);
		}
		
	}

}
