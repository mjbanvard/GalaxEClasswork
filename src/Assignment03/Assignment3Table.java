package Assignment03;

public class Assignment3Table {

	public static void main(String[] args) {
		int[] mults = {1, 2, 3, 10};
		int input = 5;
		
		for (int i = 0; i < mults.length; i ++) {
			System.out.println(input + " * " + mults[i] + " = " + (input * mults[i]));
		}

	}

}
