package forLoopday2;

public class Pyramid {

	public static void main(String[] args) {
		

		String stars= "***********";
		String spaces="           ";
		
		int starNum=1;
		int spaceNum=4;
		
		for( ; spaceNum>=0; spaceNum--, starNum+=2) {
			System.out.print(spaces.substring(0,spaceNum));
			System.out.println((stars.substring(0,starNum)));
		}
				 

	}

}
