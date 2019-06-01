package forLoopday2;

public class Homework {

	public static void main(System args[]) {
		
		String stars= "**********";
		String spaces="          ";
		
		
		
		int starNum=10;
		int spaceNum=0;
		
		
		
		for( ; starNum=>0; spaceNum++, starNum-=2) {
			
			System.out.print(spaces.substring(0,spaceNum));
			System.out.println(stars.substring(0,starNum));
		
		}
		
		

			
	}
	
	
}
