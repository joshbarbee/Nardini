import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String testString = input.nextLine();
	boolean notFinished = false;
	 do
	 {
		 System.out.print("Enter a string ===>> ");
		 String str = input.nextLine();
		 System.out.println();
		 System.out.println();
		 System.out.println("Entered String: " + str);
		 System.out.println("Palindrome: " + Palindrome.isPal(str));
		 System.out.println("Almost Palindrome: " + Palindrome.almostPal(str));
		 System.out.print("Do you wish to repeat this program [Y/N]? ===>> ");
		 String repeat = input.nextLine();
		 notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
		 System.out.println();
	 }
	 while (notFinished);

}}
