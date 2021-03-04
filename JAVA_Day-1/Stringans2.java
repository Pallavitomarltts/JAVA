import java.util.Scanner;

public class Stringans2 {
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	
	String []s3=s1.split(" ");
	String first =s3[0];
	String second =s3[1];
	
	String []s4=s2.split(" ");
	String first1=s4[0];
	String second1=s4[1];
	
	if(second.equals(second1))
	{
		System.out.println("YES");
	}
	else
	{
		System.out.println("NO");
	}
}
}
