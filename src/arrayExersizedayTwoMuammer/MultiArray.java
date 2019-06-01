package arrayExersizedayTwoMuammer;

public class MultiArray {

	public static void main(String[] args) {

		String students[][] = new String[3][2];
		
		students[0][0]="Aidana";
		students[0][1]="Enes";
		
		students[1][0]="Kanybek";
		students[1][1]="Ruslan";
		
		students[2][0]= "Muamer";
		students[2][1]= "Tima";
		
		
		for(int i=0; i<students.length; i++) {
			
			for(int k=0;k<students[i].length; k++) {
			
			
				System.out.println(students[i][k]);
				
			}
			
		}
		
							
		
	}

}
