import java.util.Scanner;

public class Lab15avst
{
	public static void main(String[] args)
   {
   	Scanner input = new Scanner(System.in);

      System.out.print("Enter the odd# size of the Magic Square -->  ");
      int size = input.nextInt();
      MagicSquare magic = new MagicSquare();

      magic.displayMagicSquare(size);

   // magic.checkRows();          // for 100 & 110 Point Version Only
   // magic.checkColumns();       // for 100 & 110 Point Version Only
   // magic.checkDiagonals();     // for 100 & 110 Point Version Only
	}
}

class MagicSquare{		
	private int[][] computeMagicSquare(int size) {
		int[][] initArray= new int[size][size];
		//setting the middle, topmost value to 0
		initArray[0][size/2] = 1;
		int indexArrayX=size/2;
		int indexArrayY=size-1;
		for(int i= 2; i<size*size; i++) {
			if(initArray[(indexArrayY+1)% size][(indexArrayX+1) %size] == 0) {
				indexArrayY = (indexArrayY-1) % size;
				indexArrayX = (indexArrayX+1) % size;
			}
			else {
				indexArrayX = (indexArrayX - 1 + size) % size;
			}

			initArray[indexArrayY][indexArrayX] = i;
			//System.out.println(indexArrayY + " " + indexArrayX + " " + i);
			
			}
			
		
		return initArray;}

	public int[][] displayMagicSquare(int size) {
		int[][] initArray = computeMagicSquare(size);
		for (int i = 0; i < size; i++) {
			String tempString = Integer.toString(initArray[i][0]);
			for (int j = 1; j < size; j++) {
				tempString += Integer.toString(initArray[i][1]);
			}
			System.out.println(tempString);
		}
		return null;
	}
}