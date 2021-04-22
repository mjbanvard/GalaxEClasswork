package Assignment03;

public class Assignment3Stars {

	public static void main(String[] args) {

		byte x = 5;
		for (int i = 0; i < x; i ++) {
			for (int j = (x - i); j > 0; j --) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
