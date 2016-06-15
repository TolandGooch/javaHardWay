import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double height, weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		// nothing blows this up.
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		// any number characters or double.
		
		System.out.print( name + "! What is your height? " );
		height = keyboard.nextDouble();
		// any number characters.
		
		System.out.println( " So you're " + age + ", Eh? That's nat very old." );
		System.out.print( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		// any letter characters.
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		// any letter characters.
		
		System.out.print( " Hopefully that is " + income + " pre hour" );
		System.out.println( " and not pre year!" );
		System.out.print( " Well, thanks for answering rude questions, " );
		System.out.println( name + "." );
		
		// It will not blow because both are number but will blow if it looking for characters.
		// It will not blow because it treats the input as typed characters.
	}
}			