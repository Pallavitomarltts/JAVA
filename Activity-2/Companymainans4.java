import java.util.Scanner;

public class Companymainans4 {
	public static void main(String args[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		Companyans4 c =new Companyans4();
			System.out.println("Enter the company name:");
			String name1=sc.nextLine();
			c.setName(name1);
			System.out.println("Enter the employees:");
			String employees1= sc.nextLine();
			c.setEmployees(employees1);
			System.out.println("Enter TeamLead:");
			String teamlead1=sc.nextLine();
			c.setTeamlead(teamlead1);
		    String []s1= employees1.split("\\.");
		   
		    for(int i=0;i<s1.length;i++)
		   {
			   if(s1[i].equals(teamlead1))
			   {
				   System.out.println(teamlead1);
				   flag=1;
			   }
		   }	
		    if(flag==0)
		    {
		    	System.out.println("Invalid Input");
		    }
		    System.out.println("NAME- "+name1);
		    System.out.println("EMPLOYEES- "+ employees1);
		    System.out.println("LEAD- "+teamlead1);
		    
	}
}
