package justForPractice;

public class namereverse {

	public static void main(String[] args) {

		String name="Bakhtiyar";
		
		for(int initial=0; initial<name.length(); initial++) {
			System.out.print(name.substring(initial,initial+1));
		}
	}

}
