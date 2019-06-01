package whileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberWhileLoop {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		int hiddenNumber=random.nextInt(10);
		
		Scanner input=new Scanner(System.in);
		
		int myNumber;
		int attempts=0;
		
		do {
			
		
			System.out.println("Guess a hidden Number: ");
			myNumber=input.nextInt();
			if(myNumber==hiddenNumber) {
				System.out.println("Congratulations!You Found a number");
			}else if(myNumber>hiddenNumber) {
				System.out.println("YOur number is More than Hidden Number");
				attempts++;
			}else if(myNumber<hiddenNumber) {
				System.out.println("Your number is Less than hidden number");
			    attempts++;
			}
			System.out.println("attempt number: "+attempts);
			
			if(attempts==3) {
				System.out.println("you lost! try afgain.");
				System.out.println("the hidden number was: "+hiddenNumber);
				break;
				
			}while(myNumber!=hiddenNumber);
			
			
			
		
		
		
		
		
		
			

	}

}
