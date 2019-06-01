package arrayPracticeDay;

import java.util.Arrays;

public class arrayMultiDimTask {

	public static void main(String[] args) {

		// create one multidimentional array of grocery items. indexes are 2 and 3
				//for first  array give the value apple, banana, strawberry
				//second array give the value of bread, cheese, lettuce.
		
		
		String [][] grocery = new String [2][3];
		
		//{{apple, banana, strawberry},{bread, cheese, lettuce}}
		
		grocery [0] [0] = "Apple";
		grocery [0] [1] = "Banana";
		grocery [0] [2] = "Strawberry";
		grocery [1] [0] = "Bread";
		grocery [1] [1] = "Cheese";		
		grocery [1] [2] = "lettuce";
		
		String [][] grocery1 = {{"Apple","Banana","String"},{"Bread","Cheese","lettuce"}};
		
		System.out.println(Arrays.toString(grocery[0]));
		System.out.println(Arrays.toString(grocery[1]));
		
		
		for(int i=0; i<grocery.length; i++) {
			for(int j=0; j<grocery[i].length;j++) {
				System.out.println(grocery[i][j]);
			}
			
		}
		
		
		

		
		
		
		
	}
	
	

}
