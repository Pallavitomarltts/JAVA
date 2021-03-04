import java.util.Scanner;

public class Customermainanas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the details");
String s1= sc.nextLine();
String []s2=s1.split("\\.");

String name1=s2[0];
String address1=s2[1];
String mobile=s2[2];

System.out.println("Name: "+name1);
System.out.println("Address: "+address1);
System.out.println("Mobile: "+mobile);

	}

}
