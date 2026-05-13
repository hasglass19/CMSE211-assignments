package lab4;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of cities:");
		int cityNum=input.nextInt();
		double points[][]=new double[cityNum][2];
		System.out.println("Enter the coordinates of the cities:");
		for(int i=0;i<cityNum;i++) {
			points[i][0]=input.nextDouble();
			points[i][1]=input.nextDouble();
		}
		
		double smallestSum=0;
		double cityCords[]=new double[2];
		for(int i=0;i<cityNum;i++) {
			double sum=0;
			for(int j=0;j<cityNum;j++)
				sum+=Math.sqrt(Math.pow((points[i][0]-points[j][0]),2)+
						Math.pow((points[i][1]-points[j][1]),2));
			if(smallestSum>sum || smallestSum==0) {
				smallestSum=sum;
				cityCords[0]=points[i][0];
				cityCords[1]=points[i][1];
			}
		}
		System.out.printf("The central city is at (%.1f, %.1f)\n"
				+ "The total distance to all other cities is %.2f"
				,cityCords[0],cityCords[1],smallestSum);
	}
	
}
