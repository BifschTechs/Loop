package arrayPracticeDay;

public class maratSamDelayu {

	public static void main(String[] args) {

		int a[]= {1,222,5,8,99,0,43};
		int sanasan=0;
		for (int index=0; index<a.length; index++) {
			if(a[index]%2==0) {
				
				sanasan=sanasan+a[index];
			}
		}System.out.println(sanasan);
	}

}
