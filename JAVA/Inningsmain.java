import java.util.Scanner;
public class Inningsmain
{
public static void main(String args[])
{
String choice=" ";
do
{
Innings i= new Innings();
Scanner sc=new Scanner(System.in);

System.out.println("Enter the team name:");
String name1=sc.nextLine();
i.setteamname(name1);

System.out.println("Enter session");
String ses1=sc.nextLine();
i.setinningsname(ses1);

System.out.println("Enter runs");
int runs1=sc.nextInt();
i.setruns(runs1);

System.out.println("name:" +i.getteamname());
System.out.println("runs" +i.getruns());

i.displayInningsdetails(runs1,ses1);
System.out.println("do you want to enter in session [y/Y]");
choice=sc.next();
}
while(choice.equalsIgnoreCase("y"));
{
}
}
}