package lab3;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		int sum;
		long num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		sum=sumDigits(num=input.nextLong());
		System.out.println("The sum of the digits of "+num+" is "+sum);
	}
	public static int sumDigits(long n)
	{
		int tot=0;
		while(n>0)
		{
			tot+=(n%10);
			n/=10;
		}
		return tot;
	}

}
