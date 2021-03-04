
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TeamcomparatorMainans2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc =new Scanner(System.in);
		ArrayList<Teamans2> al=new ArrayList<Teamans2>();
		Teamans2 t= new Teamans2();
	    System.out.println("Enter number of teams:");
		int noofteams= sc.nextInt();
  
		 for(int i=0;i<noofteams;i++)
		 {
			 System.out.println("Enter team  detail");
			 System.out.println("Enter Name");
			 String name1 = sc.next();
			 t.setName(name1);
			 System.out.println("Enter number of matches");
			 long noofmatches1 = sc.nextLong();
			 t.setNoofmatches(noofmatches1);
			 al.add(new Teamans2(name1,noofmatches1));
		 }
		 System.out.println("Team list after sort by number of matches");
		 Collections.sort(al,new Teamcomparatorans2());
		 for(Teamans2 o:al)
		 {
			 System.out.println(o.getName()+" - "+o.getNoofmatches());
		 }
		 
	}
}
