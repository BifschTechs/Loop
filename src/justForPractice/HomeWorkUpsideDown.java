package justForPractice;

public class HomeWorkUpsideDown {

	public static void main(String[] args) {


	String star="*********";
	String space="     ";
	
	int spaceNum=0;
	int starNum=9;
	
	
	for(spaceNum=0, starNum=9; 	spaceNum<=5 && starNum>=1;	 	spaceNum++, starNum-=2) {
		
		System.out.print(space.substring(0,spaceNum));
		System.out.println(star.substring(0,starNum));
	}
		
	}

}
