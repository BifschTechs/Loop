package recapEverythingByMyself;

public class ForEachLoopArray {

	public static void main(String[] args) {

		String names[]=new String[5];
		names[2]="a";
		names[3]="b";
		names[1]="c";
		names[0]="abc";
		
		
		for(String a : names) {
			System.out.println(a);
		}
		
	}

}
