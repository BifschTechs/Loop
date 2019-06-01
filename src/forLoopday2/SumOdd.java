package forLoopday2;

public class SumOdd {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int num=0; num<=100; num++ ) {
			if(num%2==1) {
				sum=sum+num;
			}
		}System.out.println(sum);

	}

}
