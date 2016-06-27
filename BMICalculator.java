import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double tInch, lb, inch, feet, bmi;
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inch = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		lb = keyboard.nextDouble();
		
		tInch = (feet * 12) + inch;
		bmi = ( lb /(tInch*tInch))*703 ;
		
		System.out.println( " Your BMI is " + bmi );
	}
}