package task3;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Task3 {

	public static void main(String[] args) throws IOException {
		 File file = new File("Exercise.txt");
		 PrintWriter output = new PrintWriter(file);
		 for(int i=0;i<100;i++)
			 output.print((int)(Math.random()*100)+" ");
		 output.close();
		 Scanner input = new Scanner(file);
		 int[] arr = new int[100];
		 for(int i=0;i<100;i++)
			 arr[i]=input.nextInt();
		 Arrays.sort(arr);
		 for(int i=0;i<100;i++) {
			 System.out.print(arr[i]+" ");
			 if((i+1)%10==0)
				 System.out.println();
		 }
	}

}
