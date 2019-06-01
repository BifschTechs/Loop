package justForPractice;

public class NameNormal {
	
	public static void main(String[] args) {
		
		String name="Azamat";
		int namelength=name.length();
		for(int i=0; i<namelength; i++) {
			//System.out.println(name.substring(i,i+1));
			System.out.print(name.charAt(i)+" ");
		}
	}

}
