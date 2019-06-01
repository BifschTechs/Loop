package forLoopday2;

import java.util.Scanner;

public class LastName {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter your name");
		String name=input.next();
		System.out.println("are u last student?");
		String answer=input.next();
		int count=1;
		String listOfNames=name;
		
		
		for( ;answer.equalsIgnoreCase("no"); count++) {
			System.out.println("Please enter your name");
			listOfNames=listOfNames+"\n"+input.next();
			System.out.println("are you last student?");
			answer=input.next();
			
		}
		
		System.out.println("total students number: "+count);
		System.out.println(listOfNames);

	}

}
