import java.util.Scanner;

public class StringOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);String s3="";
		System.out.println("enter the first string");
		String s1=sc.next();
		System.out.println("enter the second string");
		String s2=sc.next();
		System.out.println("length of the first string: "+s1.length());
		System.out.println("length of the second string: "+s2.length());
		System.out.println("concatination of both string: "+s1.concat(s2));
		System.out.println("uppercase of first string: "+s1.toUpperCase());
		for(int i=s1.length()-1;i>=0;i--)
		{
			s3=s3+s1.charAt(i);
		}
		System.out.println(s3);
		String s4="anne,stephie,banu,sasi";
		String[] s5=s4.split(",");
		for(String str:s5)
		{
		System.out.println(str);
		}
}
}
