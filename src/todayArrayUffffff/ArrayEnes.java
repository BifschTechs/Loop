package todayArrayUffffff;

import java.util.Scanner;

public class ArrayEnes {
	
	public static void main(String[] args) {
		
		String foodName[] =new String [3];
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter 5 foods");
		
		String answer=input.nextLine();
		System.out.println("food 1 "+answer);
		String answer1=input.nextLine();
		System.out.println("food2 "+answer1);
		
		
		for(int i=0;i<foodName.length; i++) {
			
			System.out.println("food" + (i+1));
			
		}
		
	}

}
