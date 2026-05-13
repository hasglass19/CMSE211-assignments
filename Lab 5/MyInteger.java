package assignment5;

public class MyInteger {
	int value;
	
	MyInteger(int newVal) {
		value=newVal;
	}
	
	int getVal() {
		return value;
	}
	
	boolean isEven() {
		if (value%2==0)
			return true;
		else
			return false;
	}
	boolean isOdd() {
		if (value%2!=0)
			return true;
		else
			return false;
	}
	boolean isPrime() {
		for(int i=2;i<value;i++)
			if(value%i==0)
				return false;
		return true;
	}
	
	public static boolean isEven(MyInteger x){
		if (x.value%2==0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(MyInteger x){
		if (x.value%2!=0)
			return true;
		else
			return false;
	}
	public static boolean isPrime(MyInteger x){
		for(int i=2;i<x.value;i++)
			if(x.value%i==0)
				return false;
		return true;
	}
	
	public static boolean isEven(int x){
		if (x%2==0)
			return true;
		else
			return false;
	}
	public static boolean isOdd(int x){
		if (x%2!=0)
			return true;
		else
			return false;
	}
	public static boolean isPrime(int x){
		for(int i=2;i<x;i++)
			if(x%i==0)
				return false;
		return true;
	}
	
	boolean equals(int x) {
		if(x==value)
			return true;
		else
			return false;
	}
	boolean equals(MyInteger x) {
		if(x.value==value)
			return true;
		else
			return false;
	}
	
	public static int parseInt(char[] x) {
		int xi=0;
		for(int i=x.length-1;i>=0;i--)
			xi+=(x[i]-'0')*Math.pow(10,(x.length-1)-i);
		return xi;
	}
	public static int parseInt(String x) {
		int xi=0;
		for(int i=x.length()-1;i>=0;i--)
			xi+=(x.charAt(i)-'0')*Math.pow(10,(x.length()-1)-i);
		return xi;
	}
	
	public static void main(String[] args) {
		MyInteger myInt=new MyInteger(346);
		String numb="3634";
		char[] otherNumb= {'4','5','7','3'};
		System.out.println(myInt.getVal());
		System.out.println(myInt.isEven());
		System.out.println(myInt.isOdd());
		System.out.println(myInt.isPrime());
		System.out.println(isEven(myInt.value));
		System.out.println(isOdd(myInt.value));
		System.out.println(isPrime(myInt.value));
		System.out.println(isEven(myInt));
		System.out.println(isOdd(myInt));
		System.out.println(isPrime(myInt));
		System.out.println(myInt.equals(547));
		System.out.println(myInt.equals(myInt));
		System.out.println(parseInt(otherNumb));
		System.out.println(parseInt(numb));
	}
}
