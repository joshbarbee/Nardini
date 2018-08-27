public class Palindrome {
	public static boolean isPal(String s)
	{
		String isPal = new StringBuilder(s).reverse().toString();
		for(int x = 0; x<isPal.length(); x++) {
			if (Character.isLetter(isPal.charAt(x)) == false) {
				return false;}}
		if(isPal.equals(s)) {
			return true;
		}
		return false;
			}
	private static boolean isLetter(String letter) {
		almostPal(letter);
		if (Character.isLetter(letter.charAt(0))) {
			return true;}
		return false;
	}
	private static String purge(String x) {
		isLetter(x);
		String compLetters = "";
		if(isLetter(x) == true) {
			compLetters+=isLetter(x);
			}
		return x;}
	
	public static String almostPal(String s) 
	{	
		isPal(s);
		String len = purge(s);
			String alPal = new StringBuilder(purge(s)).reverse().toString();
			if(alPal == purge(len)) {
				return len;
		}
		return len;
		
	}
}
