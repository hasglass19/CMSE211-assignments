package lab4;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows and colums of the array:");
		int x=input.nextInt(),y=input.nextInt();
		double array[][]=new double[x][y];
		System.out.println("Enter the array:");
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
				array[i][j]=input.nextDouble();
		int cords[]=locateLargest(array);
		System.out.printf("The location of the largest element is at (%d, %d).",cords[0],cords[1]);
	}
	
	public static int[] locateLargest(double[][] a) {
		double largest=0;
		int largeCords[] = new int[2];
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a[i].length;j++)
				if (a[i][j]>largest) {
					largeCords[0]=i;
					largeCords[1]=j;
					largest=a[i][j];
				}
		return largeCords;
	}

}
