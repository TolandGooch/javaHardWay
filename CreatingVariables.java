public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, height;
		double seconds, e, checking, cash;
		String firstName, lastName, title, jobTitle;
		
		x = 10;
		y = 400;
		age = 39;
		height = 72; 
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		cash = 100.00;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		jobTitle = "President";
		
		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName + ", I am the " + jobTitle );
	}
}