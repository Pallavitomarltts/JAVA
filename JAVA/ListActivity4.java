import java.util.ArrayList;
import java.util.Scanner;

public class ListActivity4 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int match=sc.nextInt();
int[] arr=new int[match];
for(int i=0;i<match;i++)
{
int score=sc.nextInt();
arr[i]=score;

}
int count100=0;
int count50=0;
for(int a:arr)
{
if(a>=100)
{
count100++;
}
if(a>=50&& a<100)
{
count50++;
}

}
System.out.println(count50);
System.out.println(count100);
}

}