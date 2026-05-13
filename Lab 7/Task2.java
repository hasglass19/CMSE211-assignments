package task2;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] randNums = new int[100];
		boolean continueInput=true;
		do {
			try {
				for(int i=0;i<100;i++)
					randNums[i]=(int)(Math.random()*100);
				System.out.println("Enter a number between 0 and 99 "
						+ "to view the value stored in that index.");
				int idx=input.nextInt();
				System.out.printf("The value stored in "
						+ "index %d is %d\n",idx,randNums[idx]);
				continueInput=false;
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of Bounds. Try again\n\n");
			}
		}while(continueInput);
	}

}
