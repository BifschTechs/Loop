package arrayPracticeDay;

import java.util.Scanner;

public class HomeworkMoney {

	public static void main(String[] args) {

		
		// create 3 different array and store the values inside
		//		toblerone,		 sneakers,	 	lays, 		ruffles, 	cookies, 	pepsi, 		m&m, 		fanta, 		7up
		//number 1,				   2,			 3,		     4,				5,		6,			7,			8,			9
		//prices 1					2 			  3 		4 				5		 6 			7 			8 			9
		
		
		
		//write the code for vending machine 
		//first, user should enter the product number
		//then the machine will ask "the price of the product"
		//if product price is matching with expected price
		//then print enjoy with the "productName"
		//if product price is not matching with expected amount 
		//print please try again
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an Item Number:");
		
		
		String [] productName = {"toblerone", "sneakers", "lays", "ruffles", "cookies", "pepsi", "m&m", "fanta", "7up"};
		
		int [] productNumber = {1,				2,			3,			4,		5,			6,		7,		8,		9};
		
		int [] productPrice = { 3,				4,			5,			6,		7,			8,		9,		10,		11};
		
			int pNumber=input.nextInt();
			
			for(int i=0; i<productNumber.length;i++) {
				if(pNumber==productNumber[i]) {
					System.out.println("please enter the product price  "+productPrice[i]);
					
					int pPrice=input.nextInt();
					if(pPrice==productPrice[i]){
						System.out.println("Please enjoy with the "+productName[i]);
						
						
					}else {
						System.out.println("please try again");
					}
					
					
				}

			}
			
			
			
			
			
			
		

		
		
		
		
		
	}

}
