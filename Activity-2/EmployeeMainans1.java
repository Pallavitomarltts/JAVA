import java.util.Scanner;

public class EmployeeMainans1 {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	Employeeans1 e= new Employeeans1();
	System.out.println("Enter the name");
	String name1= sc.nextLine();
	e.setName(name1);
	System.out.println("Enter Address");
	String address1= sc.next();
	e.setAddress(address1);
	System.out.println("Enter Mobile number");
	String mobile1 =sc.next();
	e.setMobile(mobile1);
	System.out.println("Employee Details");
	System.out.println("Name: "+e.getName());
	System.out.println("Address: "+e.getAddress());
	System.out.println("Mobile: "+e.getMobile());
}
}
