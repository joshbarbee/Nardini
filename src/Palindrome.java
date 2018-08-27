import java.awt.List;
import java.util.ArrayList;

public class Palindrome {
	public static String isPal(String s)
	{
		String isPal = new StringBuilder(s).reverse().toString();
		if(isPal.equals(s)) {
			return "true";
		}
		return "false";
			}
	private static String isLetter(String letter) {
		ArrayList<String> compLetters = new ArrayList<String>();
		if (Character.isLetter(letter.charAt(0))) {
			compLetters.add(letter.charAt(0));
		}
		return compLetters.toString();	
	}
	
	private static String purge(String s) {
		isLetter(letter);
		return s;
		
	}
	
	public static boolean almostPal(String s) {
		return false;
		
	}
}
