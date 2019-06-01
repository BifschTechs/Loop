package array3;

import java.util.concurrent.ThreadLocalRandom;

public class homeWorkRecapNextDay {

	public static void main(String[] args) {


		double [] array = new double[200];
		double avg=0.0;
		int count=0;
		
		for(int i=0; i<array.length;i++) {
			array[i]=ThreadLocalRandom.current().nextDouble(0, 200);
			avg+=array[i];
			System.out.println("this is random array element: "+array[i]);
			count++;
		}
		avg=avg/count;
		
		System.out.println(avg);
	}

}
