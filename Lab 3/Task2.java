package lab3;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		int nmb,rev;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		rev=reverse(nmb=input.nextInt());
		System.out.println("The reverse of "+nmb+" is "+rev+" and it is "
				+(isPalindrome(nmb)?"a Palindrome":"NOT a Palindrome"));
	}
	public static int reverse(int number)
	{
		int rebmun=0;
		while(number>0)
		{
			rebmun*=10;
			rebmun+=(number%10);
			number/=10;
		}
		return rebmun;
	}
	public static boolean isPalindrome(int number)
	{
		if(reverse(number)==number)
			return true;
		else
			return false;
	}
}
