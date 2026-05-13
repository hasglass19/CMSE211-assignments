package task1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput=true;
		
		do {
			try {
				System.out.println("Enter two integers to see their sum:");
				int x=input.nextInt();
				int y=input.nextInt();
				int summ=x+y;
				System.out.printf("The sum of the integers %d and %d is %d\n",x,y,summ);
				continueInput=false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Incorrect Input: Number must be an integer. Try again\n\n");
				input.nextLine();
			}
		}while(continueInput);
	}
}
