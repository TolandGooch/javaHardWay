public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println("Here.");
		erebor(); // erebor; will not compile as it is not a complete statement. 
		System.out.println("Back first time. ");
		// erebor();   Compiler will just pass/skip this line of code.
		System.out.println("Back second time.");
	}
		
	public static void erebor() {
		System.out.println("There.");	
	}
}