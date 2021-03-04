import java.util.Scanner;

public class Arrayans1 {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
   System.out.println("size");
   int size = sc.nextInt(); 
   if(size<0)
   {
	   System.out.println("Invalid Input");
	   System.exit(0);
   }
   
   int arr[]=new int[size];
   System.out.println("Enter the element"+size);
   for(int i=0;i<size;i++)
   {
	   int p =sc.nextInt();
	   if(p<0)
	   {
		   System.out.println("Invalid Input");
	   }
	   else 
	   {
		   arr[i]=p;
	   }
   }
   System.out.println("Enter the element to be searched");
   int x = sc.nextInt();
   int flag=0;
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]==x)
	   {
		   System.out.println(arr[i]);
		   flag=1;
	   }
	  
   }
   if(flag==1)
   {
	   System.out.println("Element found");
   }
   if(flag==0)
   {
	   System.out.println("Element not found");
   }
}
}
