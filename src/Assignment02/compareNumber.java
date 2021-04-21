package Assignment02;

import java.util.Arrays;

public class compareNumber {
	
	public static int compareTwo(int[] nums2) {
		if (nums2[0] < nums2[1]) {
			return nums2[1];
		} else {
			return nums2[0];
		}
	}
	
	public static int compareThree(int[] nums3) {
		Arrays.sort(nums3);
		return nums3[0];
	}
	
	public static void main(String[] args) {
		// final String[] args1 = {"2", "53", "969", "437"/*, "1"*/};
		int output;
		
		int[] argsInt = new int[args.length];
		for (int i = 0; i < args.length; i ++) {
			argsInt[i] = Integer.parseInt(args[i]);
		}
		if (args.length == 2) {
			output = compareTwo(argsInt);
		} else if (args.length >= 3) {
			output = compareThree(argsInt);
		} else {output = 404;}
		//System.out.println(args.length);
		System.out.println(output);
	}
 
}
