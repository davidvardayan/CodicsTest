package davidVardanyanSumofDigits2;

import java.util.Scanner;

public class SumofDigitsUsingForLoop {
	private static Scanner sc;

	public static void main(String[] args) {
		
		int Number, Reminder, Sum = 0;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		for (Sum = 0; Number > 0; Number = Number/10){
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
		}
		  if(Sum > 9) {
			  System.out.println("Please Enter any Number: ");
				Number = sc.nextInt();
		  } else {
			  System.out.format("Sum of the digits of Given Number = %d", Sum);
		  }
		
	}
		

	}


