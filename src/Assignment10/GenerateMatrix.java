package Assignment10;

public abstract class GenerateMatrix {

	public static int[][] newMatrix(int[] dims) {
		int[][] mat = new int[dims[0]][dims[1]];
		
		//This nested loop generates a multidimensional array from a 2 element array.
		for (int i = 0; i < dims[0]; i++) {
			for (int j = 0; j < dims[1]; j++) {
				mat[i][j] = (i * dims[1] + j);
			}
		}
		return mat;
	}
	
}
