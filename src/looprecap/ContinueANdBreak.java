package looprecap;

public class ContinueANdBreak {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("____________");
		
		for(int i=0; i<=10; i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
		
	}

}
