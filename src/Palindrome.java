public class Palindrome {
	public static boolean isPal(String s)
	{
		String isPal = new StringBuilder(s).reverse().toString();
		//reverses string
		for(int x = 0; x<isPal.length(); x++) {
			if(isLetter(isPal.substring(x,x+1)) == false) {
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
		if (letter.compareTo("a") >= 0 && letter.compareTo("z") <= 26) {
			//checks to make sure it is actually letters 
			return true;}
		return false;
	}
	private static String purge(String x) {
		//parses out all non-alpha inputs
		return x.replaceAll("[^A-Za-z]", "");}
	
	public static boolean almostPal(String s) 
	{	
		//calls the purged string method to parse out the string
		String purgedString = purge(s);
		//reverses the string 
		String alPal = new StringBuilder(purgedString).reverse().toString();
		if(alPal.equals(purgedString) && isPal(s) != true) {
			//strict equality check. checks to make sure that isPal didnt already check out as false
			return true;
		}
		return false;
		
	}
}
