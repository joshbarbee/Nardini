public class Palindrome {
	public static boolean isPal(String s)
	{
		String isPal = new StringBuilder(s).reverse().toString();
		//reverses string
		for(int x = 0; x<isPal.length(); x++) {
			if (Character.isLetter(isPal.charAt(x)) == false) {
				//checks to see if the characters are all letters or not
				return false;}}
		if(isPal.equals(s)) {
			//equality check between passed string and isPal string
			return true;
		}
		//returns false if equality check !=
		return false;
			}
	private static boolean isLetter(String letter) {
		if (Character.isLetter(letter.charAt(0))) {
			return true;}
		return false;
	}
	private static String purge(String x) {
		//parses out all non-alpha inputs
		return x.replaceAll("[^A-Za-z0-9]", "");}
	
	public static boolean almostPal(String s) 
	{	
		//calls the purged string method to parse out the string
		String purgedString = purge(s);
		//reverses the string 
		String alPal = new StringBuilder(purgedString).reverse().toString();
		if(alPal.equals(purgedString) && isPal(s) != true) {
			//strict equality check
			return true;
		}
		return false;
		
	}
}
