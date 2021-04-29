package Collections;


public class ArrayExample {

	public static void main(String[] args) {
		int array[] = {2, 45, 38, 53, 89};
		// array = new int[5];

		int array1[] = new int [10];
		
		for (int i = 0; i < array.length; i ++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("******************************");
		
		for (int j = 0; j < array1.length; j++) {
			array1[j] = j * 10;
		}
		
		
		int temp = array1[0];
		array1[0] = array1[array1.length-1];
		array1[array1.length-1] = temp;
		
		
		for (int j = 0; j < array1.length; j++) {
			System.out.println(array1[j]);
		}
		
	}

}
