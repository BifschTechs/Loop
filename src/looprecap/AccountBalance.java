package looprecap;

import java.util.Scanner;

public class AccountBalance {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your balance :");
		
		int balance=input.nextInt();
		
		while(balance>0) {
			System.out.println("Please enter your transaction: ");
			
			int transaction=input.nextInt();//20
			if(transaction>balance) {
				System.out.println("Hey, you trying to be sneaky");
				continue;//it stops go again to the beginning,skipping after
				         //continue sign
			}
			balance=balance-transaction;//100-20=80
		System.out.println("Your current balance is "+balance);
			
		}
		System.out.println("You are out of balance");
				

	}

}
