import java.util.Scanner;

public class Arrayans2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter the no of elements");
 int noofelement = sc.nextInt();
 System.out.println("Enter the elements");
 int arr[]=new int[noofelement];
 for(int i=0;i<noofelement;i++)
 {
	 int p= sc.nextInt();
	 if(p<0)
	 {
		 System.out.println("Invalid Input");
	 }
	 else
	 {
		 arr[i]=p;
	 }
  }
 
 System.out.println("Enter minimum score");
 int score= sc.nextInt();
 int flag=0;
 for(int i=0;i<arr.length;i++)
 {
	 if(score!=arr[i])
	 {
		 flag=0;
	 }
	 else
	 {
		 flag=1;
	 }
 }
 if(flag==1)
 {
	 System.out.println("Invalid Input");
 }
   findCricketerId(arr,noofelement,score);
 }
	public static void findCricketerId(int arr[], int noofelement, int score)
	 {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>score)
			{
				System.out.println(arr[i-1]);
			}
		}
 }
  

}
