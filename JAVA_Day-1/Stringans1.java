import java.util.Scanner;

public class Stringans1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		
		String rem1 = s1.substring(0,1);
		String rem2 = s1.substring(1, s1.length()).toLowerCase();
		
		rem1=rem1.toUpperCase();
		s2 = s2.toUpperCase();
	System.out.println(rem1+rem2);
	System.out.println(s2);
			}

}
