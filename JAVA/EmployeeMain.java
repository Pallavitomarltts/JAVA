import java.util.Scanner;

public class EmployeeMain
{
public static void main(String args[])
{
Employee e=new Employee();
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Name:");
String name1 =sc.nextLine();
e.setname(name1);

System.out.println("Enter Address:");
String address1=sc.nextLine();
e.setaddress(address1);

System.out.println("Enter Mobile");
String mobile1=sc.nextLine();
e.setmobile(mobile1);

System.out.println("Employee deatils");
System.out.println("Name :"+e.getname());
System.out.println("Address:"+e.getaddress());
System.out.println("Mobile:"+e.getmobile());

}
}