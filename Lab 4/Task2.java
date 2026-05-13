package lab4;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter list1:");
		int len1=input.nextInt();
		int fList[]=new int[len1];
		for(int i=0;i<len1;i++)
			fList[i]=input.nextInt();
		
		System.out.println("Enter list2:");
		int len2=input.nextInt();
		int sList[]=new int[len2];
		for(int i=0;i<len2;i++)
			sList[i]=input.nextInt();
		
		int tList[]=new int[len1+len2];
		tList=merge(fList,sList);
		System.out.println("The merged list:");
		for(int i=0;i<tList.length;i++)
			System.out.printf("%d ", tList[i]);
	}
	public static int[] merge(int[] list1, int[] list2) {
		int i=0, j=0, k=0;
		int ordList[] = new int[list1.length+list2.length];
		while(i<list1.length && j<list2.length) {
			if(list1[i]<=list2[j])
				ordList[k++]=list1[i++];
			else
				ordList[k++]=list2[j++];
		}
		while(i<list1.length)
			ordList[k++]=list1[i++];
		while(j<list2.length)
			ordList[k++]=list2[j++];
		return ordList;
	}
}
