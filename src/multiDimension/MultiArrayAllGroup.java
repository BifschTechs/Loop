package multiDimension;

public class MultiArrayAllGroup {

	public static void main(String[] args) {

		String[][] techGroup=new String[4][];

		techGroup [0] =new String [] {"Kuttubek", "Maiia","Enes", "Kuba", "Eliza"};
		techGroup [1] =new String [] {"Ayzada", "Aziia", "Marat", "Asiyat", "Den", "Mehmet"};
		techGroup [2] =new String [] {"Ruslan", "Kanybek", "Saltanat", "Aizat", "Asli", "Ulan"};
		techGroup [3] =new String []  {};
		
		for(int i=0; i<techGroup[1].length; i++) {
			System.out.println(techGroup[1][i]);
	
		}
	}
}
