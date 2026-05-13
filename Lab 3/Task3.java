package lab3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		if(isHappy(input.nextInt()))
			System.out.println("This number is Happy.");
		else
			System.out.println("This number is Sad.");
    }
	
	public static boolean isHappy(int number)
	{
		int sum=0;
		while((number!=1) && (number!=4))
		{
			while(number>0)
			{
				sum+=(Math.pow((number%10),2));
				number/=10;
			}
			number=sum;
			sum=0;
		}
		if(number==1)
			return true;
		else return false;
	}

}
