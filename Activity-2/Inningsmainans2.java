import java.util.Scanner;

public class Inningsmainans2 {
	public static void main(String args[])
			{
		String choice="";
		do {
		Scanner sc =new Scanner(System.in);
		Inningsans2 i= new Inningsans2();
		System.out.println("Enter the team name");
		String name1 =sc.nextLine();
		i.setTeamname(name1);
		System.out.println("Enter session");
		String session1= sc.next();
		i.setInningsname(session1);
		System.out.println("Enter runs");
		int runs1=sc.nextInt();
		i.setRuns(runs1);
		System.out.println("Name: "+i.getTeamname());
		System.out.println("Scores: "+i.getRuns());
		i.displayInningsDetails(runs1,session1);
		System.out.println("want to end the session[y/Y]");
		choice=sc.next();
			} while(choice.equalsIgnoreCase("y"));
	
}
}
