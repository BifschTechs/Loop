package array3;

public class ArraysHomeworkAverageOfAll {

	public static void main(String[] args) {


		double [] db= new double [200];
		
		double sum=0;
		double average=0;
		
		for(int i=0; i<200; i++) {
			
			sum=sum+i;
			average=sum/db.length;
			
		}	System.out.println(average);
	}

}
