import java.util.Scanner;
class stringmatch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2= sc.nextLine();

String s3[] =s1.split(" ");
String first = s3[0];
String sec = s3[1];

String p1[] =s2.split(" ");
String first1 = p1[0];
String sec2 = p1[1];

if(sec.equals(sec2))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}