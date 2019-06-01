package forLoopday2;

public class DividibleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int dividable=0; dividable<=100; dividable++) {
			if(dividable%3==0 && dividable%5==0) {
				System.out.println(dividable);
			}
		}
	}

}
