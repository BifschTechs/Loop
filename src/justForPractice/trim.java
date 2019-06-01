package justForPractice;

//import static org.junit.Assert.assertEquals;

//import org.junit.Test;

//import main.com.techtorial.StringManipulations;

public class trim {

	public static void main(String[] args) {

		String reverse = "WE WILL BE STRUGGLING A LOT. WE WON'T TELL ANYBODY A WORD";

		String newReverse=reverse.substring(53,57).toLowerCase();//word
		
		int result=newReverse.length()-1; 
		 
		String reversedWord="";
		for (int a=result; a>=0; a--) {
			
			reversedWord += newReverse.charAt(a)+"";
		
		
System.out.println(reversedWord);



		}
	}	

}

	


