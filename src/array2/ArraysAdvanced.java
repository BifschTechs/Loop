package array2;

public class ArraysAdvanced {

	public static void main(String[] args) {

		
		String [] str = new String [5];
		
		str[0] = "Aa";
		str[1] = "Bb";
		str[2] = "Cc";
		str[3] = "Dd";
		//we are missing str[4]
		
		for (int i=str.length-1; i>0; i--) {
			if(str[i]==null){
				System.out.println(i);
			}
		}
		
		
		
	}

}
