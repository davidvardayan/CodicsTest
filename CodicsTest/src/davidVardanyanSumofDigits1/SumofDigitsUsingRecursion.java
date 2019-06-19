package davidVardanyanSumofDigits1;

import java.util.Scanner;

public class SumofDigitsUsingRecursion {
	
	private static Scanner sc;

	public static void main(String[] args) {
	
		int Number, Sum = 0;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		SumofDigits sd = new SumofDigits();
		Sum = sd.SumoftheDigits(Number);
		
		
		System.out.format("\n Sum of the digits of Given Number = %d", Sum);
	}

}


