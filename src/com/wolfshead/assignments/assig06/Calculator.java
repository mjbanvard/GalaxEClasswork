package com.wolfshead.assignments.assig06;

import java.util.Scanner;

public class Calculator {

//	int numI;
//	Integer numInteg;
//	double numD;
//	float numF;
//	short numS;
//	long numL;
	
	public int add(int[] num) {
		int sum = num[0] + num[1];
		
		return sum;
	}
	
//	public Integer add(Integer num1, Integer num2) {
//		Integer sum = num1 + num2;
//		
//		return sum;
//	}
	
	public double add(double[] num) {
		double sum = num[0] + num[1];
		
		return sum;
	}
	
	public float add(float[] num) {
		float sum = num[0] + num[1];
		
		return sum;
	}
	
//	public short add(short num1, short num2) {
//		short sum = num1 + num2;
//		
//		return sum;
//	}
	
	public long add(long[] num) {
		long sum = num[0] + num[1];
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] inInt = new int [2]; 
		float[] inFloat = new float[2];
		double[] inDouble = new double[2];
//		int ct = 0;
		
		Scanner inTwoNums = new Scanner(System.in);
		System.out.println("Please enter two numbers to be added, separated by a space: ");
		
	      if (inTwoNums.hasNextInt()) {
	    	  for (int i = 0; i < 2; i ++) {
	    		  inInt[i] = inTwoNums.nextInt();
	    	  }
	      } else if (inTwoNums.hasNextDouble()) {
	    	  for (int i = 0; i < 2; i ++) {
	    		  inDouble[i] = inTwoNums.nextDouble();
	    	  }
	      } else if (inTwoNums.hasNextFloat()) {
	    	  for (int i = 0; i < 2; i ++) {
	    		  inFloat[i] = inTwoNums.nextFloat();
	    	  }
//		      } else if (inTwoNums.hasNextBoolean()) {
//		        System.out.println("boolean: " + inTwoNums.nextBoolean());
	      } else {
	        System.out.println(inTwoNums.next());
	      }
	      inTwoNums.close();
	}
		
		
		
		/* public class ScannerNextExample1 {
	
		    public static void main(String[] args) {      
		        System.out.print("Enter full name: ");        
		        Scanner scan = new Scanner(System.in);  
		        String firstName = scan.next();  
		        String lastName = scan.next();  
		        System.out.println("First Name is: "+firstName);  
		        System.out.println("Last Name is: "+lastName);    
		        scan.close();  
		    }  
		}  */
		
		/*  Scanner src = new Scanner(fin);

		    while (src.hasNext()) {
		      if (src.hasNextInt()) {
		        System.out.println("int: " + src.nextInt());
		      } else if (src.hasNextDouble()) {
		        System.out.println("double: " + src.nextDouble());
		      } else if (src.hasNextBoolean()) {
		        System.out.println("boolean: " + src.nextBoolean());
		      } else {
		        System.out.println(src.next());
		      }
		    }
		 */
		
		
//		Scanner input = new Scanner(System.in);
//		
//		var input1 = input.next();
//		var input2 = input.next();
//		input.close();
		
//		int oneInt, twoInt;
//		Integer oneInteg;
//		double oneD;
//		float oneF;
//		short numS;
//		long numL;
		
//		c.add(input1, input2);
}


