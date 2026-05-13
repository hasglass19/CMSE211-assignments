package assignment5;

public class MyString {
	char[] characs;
	public MyString(char[] chars){
		characs = new char[chars.length];
		for(int i=0;i<chars.length;i++)
			characs[i]=chars[i];	
	}
	public char charAt(int index) {
		return characs[index];
	}
	public int length() {
		return characs.length;
	}
	public MyString substring(int begin, int end) {
		char[] subStr=new char[end-begin+1];
		int j=0;
		for(int i=begin;i<=end;i++)
			subStr[j++]=characs[i];
		return new MyString(subStr);
	}
	public MyString toLowerCase() {
		char[] subStr=new char[characs.length];
		for(int i=0;i<characs.length;i++)
			if(characs[i]>='A' && characs[i]<='Z')
				subStr[i]=(char)(characs[i]+32);
			else
				subStr[i]=characs[i];
		return new MyString(subStr);
	}
	public boolean equals(MyString s) {
		if(s.length()!=characs.length)
			return false;
		for(int i=0;i<characs.length;i++)
			if(s.charAt(i)!=characs[i])
				return false;
		return true;
	}
	public static MyString valueOf(int i) {
		if(i==0)
			return new MyString(new char[]{'0'});
		int temp = i;
        int digitCount = 0;
        while (temp > 0) {
            temp /= 10;
            digitCount++;
        }
		char[] valueStr=new char[digitCount+(i<0?1:0)];
		
		if(i<0) {
			valueStr[0]='-';
			i=-i;
		}
		int index = valueStr.length - 1;
		while(i>0) {
			valueStr[index--] = (char)('0' + (i % 10));
            i /= 10;
		}
		return new MyString(valueStr);
	}
	public int compare(String s) {
		for(int i=0;i<Math.min(s.length(), characs.length);i++) {
			if(characs[i]!=s.charAt(i))
				return characs[i] - s.charAt(i);
		}
		return characs.length - s.length();
	}
	public MyString substring(int begin) {
        return substring(begin, characs.length-1);
    }
	public MyString toUpperCase() {
		char[] subStr=new char[characs.length];
		for(int i=0;i<characs.length;i++)
			if(characs[i]>='a' && characs[i]<='z')
				subStr[i]=(char)(characs[i]-32);
			else
				subStr[i]=characs[i];
		return new MyString(subStr);
	}
	
	public static void main(String[] args) {
		MyString str1=new MyString(new char[]{'H','e','l','l','o'});
		MyString str2=new MyString(new char[]{'W','o','r','l','d'});
		System.out.println(str1.length());
		System.out.println(str1.substring(1,3));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.equals(str2));
		System.out.println(valueOf(3466));
		String testStr="Hello World";
		System.out.println(str1.compare(testStr));
		System.out.println(str1.substring(2));
		System.out.println(str1.toUpperCase());
	}

}
