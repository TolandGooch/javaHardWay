import java.util.Scanner;

public class BMICategories {
	public static void main( String [] args ) {
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
		
		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if (bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if (bmi <= 18.5 ) {
			System.out.println( "underweight" );
		}
		else if (bmi <= 25.0 ) { // added "else" back in to correct
			System.out.println( "normal weight" );
		}
		else if (bmi <= 30.0 ) {
			System.out.println( "overweight" );
		}
		else if (bmi <= 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if (bmi <= 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( " very severely/\"morbidly\" obese" );
		}
	}
}						
		