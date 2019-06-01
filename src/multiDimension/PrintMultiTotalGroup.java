package multiDimension;

public class PrintMultiTotalGroup {

	public static void main(String[] args) {

		
		String[][] techGroup=new String[4][];

		techGroup [0] =new String [] {"Kuttubek", "Maiia","Enes", "Kuba", "Eliza"};
		techGroup [1] =new String [] {"Ayzada", "Aziia", "Marat", "Asiyat", "Den", "Mehmet"};
		techGroup [2] =new String [] {"Ruslan", "Kanybek", "Saltanat", "Aizat", "Asli", "Ulan"};
		techGroup [3] =new String []  {};
		
		for(int i=0; i<techGroup[1].length; i++) {
			for (int y=0; y<techGroup[i].length; y++) {
				
			System.out.println(techGroup[i][y]);
			
			
	}

}}
}