package davidVardanyanSumofDigits1;

public class SumofDigits {
	
	int Sum = 0, Reminder;
	
	public int SumoftheDigits(int Number) {
		if(Number > 0 ) {
			Reminder = Number % 10;
			Sum = Sum + Reminder;
			SumoftheDigits(Number / 10);		
			return Sum;
		}
		else {
			return Sum;
		}
	}

}
