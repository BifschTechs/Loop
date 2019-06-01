package looprecap;

public class MethodChain {

	public static void main(String[] args) {

		
		String word="Love Java";
		
		System.out.println(word.substring(6));
		System.out.println(word.toLowerCase().substring(5,6));
		System.out.println(word.substring(4,7));
		System.out.println(word.substring(3,4).toUpperCase());
		
		
		System.out.println(word.replace("e","E"));
		
		

		System.out.println(word.replace("e", "E").substring(0,8).concat("A"));
		}
		
	}






