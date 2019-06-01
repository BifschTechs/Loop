package justForPractice;

import java.util.Scanner;

	public class name {
	
public static void main(String[] args) {

	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter a name");
	
	String name=input.next();//maratt
    int i=0;
	int length=name.length();//6
		//0	  0	6	   0+2>2
	for(i=0; i<length; i+=2 ) {
		 {
			System.out.println(name.substring(i,1));
		}
							//maratt. (0,2)
		System.out.println(name.substring(i,i+2));
	}
	



	
}

}
