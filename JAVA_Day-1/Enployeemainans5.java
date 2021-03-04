import java.util.Scanner;

public class Enployeemainans5 {
 public static void main(String args[])
 {
	 Scanner sc= new Scanner(System.in);
	 Employeeans5 e= new Employeeans5();
	 System.out.println("Enter the name : ");
	 String name=sc.nextLine();
	 e.setName(name);
	 System.out.println("Enter Address : ");
	 String address =sc.next();
	 e.setAddress(address);
	 System.out.println("Enter Mobile : ");
	 String mobile=sc.next();
	 e.setMobile(mobile);
	 
	 System.out.println("Employee details ");
	 System.out.println("Name: "+e.getName());
	 System.out.println("Address: "+e.getAddress());
	 System.out.println("Mobile: "+e.getMobile());
	 
	 System.out.println("MENU");
	 System.out.println("1. Update Employee name");
	 System.out.println("2.Update Employee Address");
	 System.out.println("3.Update Employee mobile");
	 System.out.println("4.All information correct/Exit");
	 
	 int choice =sc.nextInt();
	 if(choice==1)
	 {
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("Current name is : "+e.getName());
		 System.out.println("Enter new name :");
		 String name1=sc1.nextLine();
		 e.setName(name1);
		 System.out.println("Employee details ");
		 System.out.println("Name: "+e.getName());
		 System.out.println("Address: "+e.getAddress());
		 System.out.println("Mobile: "+e.getMobile());
 
	 }
	 if(choice==2)
	 {
		 Scanner sc2=new Scanner(System.in);
		 System.out.println("Current address is : "+e.getAddress());
		 System.out.println("Enter new address :");
		 String address1=sc2.nextLine();
		 e.setName(address1);
		 System.out.println("Employee details ");
		 System.out.println("Name: "+e.getName());
		 System.out.println("Address: "+e.getAddress());
		 System.out.println("Mobile: "+e.getMobile());
 
	 }
	 if(choice==3)
	 {
		 Scanner sc3=new Scanner(System.in);
		 System.out.println("Current mobile is : "+e.getMobile());
		 System.out.println("Enter new mobile :");
		 String mobile1=sc.nextLine();
		 e.setName(mobile1);
		 System.out.println("Employee details ");
		 System.out.println("Name: "+e.getName());
		 System.out.println("Address: "+e.getAddress());
		 System.out.println("Mobile: "+e.getMobile());
 
	 }
	 if(choice==4)
	 {
		 System.out.println("All information correct [yes]");
		 System.exit(0);
	 }
	 
	 
	 
 }
}
