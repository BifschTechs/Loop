package justForPractice;

public class ReverseNameForLoop {

	public static void main(String[] args) {

		String name="Sarrah";
		int nameLength=name.length()-1;
		
		int initial;
		for(initial=nameLength; initial>=0; initial-- ) {
			System.out.print(name.charAt(initial));
		}
	}

}
