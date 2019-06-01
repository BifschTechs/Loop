package looprecap;

import java.util.Scanner;

public class SplitWord {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a string");
		String word=input.next();

		int length=word.length();
		
		for(int i=0; i<length; i+=2) {
			
			if(i+2>length){
				System.out.println(word.charAt(length-1));
			}else {
				System.out.println(word.substring(i,i+2));
			}
		}
	}

}
