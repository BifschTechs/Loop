  package doWhileLoop;

public class WhileDoStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nachalo=1;
		String jildiz="*";
		
		
		do {
			jildiz=jildiz+"*";
			System.out.println(jildiz);
			nachalo++;
		}while(nachalo<10);

	}

}
