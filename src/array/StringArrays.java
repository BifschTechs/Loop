package array;

public class StringArrays {

	public static void main(String[] args) {

		String[]names=new String[5];
		names[0]="Dmytro";
		names[1]="Kuttubek";
		names[2]="Mehmet";
		names[3]="Enes";
		names[4]="Asiyat";
		
							//5<5(False)
		for (int index=0; index<names.length; index++) {
			//interview question what is the difference

			System.out.println(names[index]);
			
		}
	System.out.println("_________________________________________");
	
	
	for(String n: names) {
		System.out.println(n);
	}
	}

}
