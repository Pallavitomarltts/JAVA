import java.util.Scanner;
class Stringup
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String first= sc.next();
String second = sc.next();
String n=first.substring(0,1);
String rem=first.substring(1,first.length()).toLowerCase();
n=n.toUpperCase();
second=second.toUpperCase();
System.out.println(n+rem);
System.out.println(second);
}
}