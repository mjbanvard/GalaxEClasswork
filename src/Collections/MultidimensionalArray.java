package Collections;


public class MultidimensionalArray {
	
	public static void main(String[] args) {
		
		int [][] mDA = new int[3][3];
		
		mDA[1][2] = 500;
		
		System.out.println(mDA[1][2]);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mDA[i][j] = i + j;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mDA[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
