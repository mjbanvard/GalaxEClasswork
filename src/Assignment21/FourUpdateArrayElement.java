package Assignment21;

public class FourUpdateArrayElement {
	
	// 4. Write a Java program to update specific array element by given element. 


	public static void main(String[] args) {
		int[] start = {1, 5, 8, 23, 6785, 432, 54};
		int givenElement = 28;
		int element = 5;
		
		System.out.print("[");
		int i = 0;
		do {
			System.out.print(start[i] + ", ");
			i ++;
		} while (i < (start.length - 1));
		System.out.println(start[i] + "]");
		
		System.out.println("******************************");
		start[element] = givenElement;
		
		System.out.println("This is the above array, with element " + element + " updated with the value of " + givenElement);
		System.out.print("[");
		int j = 0;
		do {
			System.out.print(start[j] + ", ");
			j ++;
		} while (j < (start.length - 1));
		System.out.println(start[j] + "]");
	
	}

}
