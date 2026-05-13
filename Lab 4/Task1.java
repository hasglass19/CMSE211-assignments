package lab4;
import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int inNums[]=new int[10];
		int outNums[]=new int[10];
		System.out.println("Enter ten numbers:");
		for(int i=0;i<inNums.length;i++)
			inNums[i]=input.nextInt();
		outNums=eliminateDuplicates(inNums);
		System.out.println("The distinct numbers are:");
		for(int i=0;i<outNums.length;i++)
			if(outNums[i]!=0)
				System.out.printf("%d ",outNums[i]);
	}
	
	public static int[] eliminateDuplicates(int[] list){
		boolean dupeFound;
		int distinctNums[]=new int[10];
		int k=0;
		for(int i=0;i<list.length;i++){
			dupeFound=false;
			for(int j=i;j<list.length;j++){
				if(i==j)
					continue;
				if(list[i]==list[j])
					dupeFound=true;
			}
			if (dupeFound==false)
				distinctNums[k++]=list[i];
		}
		return distinctNums;
	}
}
