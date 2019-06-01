package looprecap;

public class NestedForLoop {

	public static void main(String[] args) {

		outerloop: for(int i=0; i<=10; i++) {
				   System.out.print(i+ "->");
				   for(int i2=0; i2<=10; i2++) {
				   System.out.print(i2+ " ");
				   break outerloop;
				
			}
				   System.out.println();
		}
			
	}

}
