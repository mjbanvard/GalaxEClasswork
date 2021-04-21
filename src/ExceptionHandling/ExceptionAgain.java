package ExceptionHandling;

public class ExceptionAgain {

	public static void main(String[] args) {
		ExceptionAgain exceptionAgain = new ExceptionAgain();
//		EmployeeService es = new EmployeeService();
		
		int num1 = 40;
		int num2 = 0;
		
		String message = exceptionAgain.dividedByZero(num1, num2);
		System.out.println("Result of dividedByZero = " + message);
		int result = exceptionAgain.sumOfTwo(num1, num2);
		System.out.println("Result of SumOfTwo = " + result);
	}
		
		
		
		String dividedByZero(int num, int dividedBy) {
			String message = "divide without exception";
			try {
				int result = num % dividedBy;
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				message = "not divided due to 0";
			}
			return message;
		}
		
		
		int sumOfTwo(int num1, int num2) {
			String s = "1aa0";
			int i;
			
			try {
				i = Integer.parseInt(s);
				System.out.println("value of i = " + i);
				
			} catch (NumberFormatException nfe) {
				System.out.println("Number formatting");
			}
		return num1 + num2;
			}
		
//		try (result) {
//			DivideByZeroException e;
//		}
//		
//		System.out.println(result);
	}


// Use your DeBug tool! 