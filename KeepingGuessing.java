import java.util.Scanner;

public class KeepingGuessing {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;
			
		secret = 1 + (int)( Math.random()*10);
			
		System.out.println( "I have a chosen a number between 1 and 10." );
		System.out.println( "Try to guess it. " );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
			
		while ( secret != guess ) {
			if ( guess < secret ) {
				System.out.println( "Sorry, your guess is too low. ");
			}
			if ( guess > secret ) {
				System.out.println( "Sorry, your guess is too high. ");
			}
			System.out.println( "That is incorrect. Guess again. " );
			System.out.print( " Your guess: " );
			guess = keyboard.nextInt();
		}
			
		System.out.println( "That's right! You're a good guesser. " );
	}
}