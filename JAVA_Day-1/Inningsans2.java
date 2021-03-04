
public class Inningsans2 {
private String teamname;
private String inningsname;
private int runs;
String end="second";
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public String getInningsname() {
	return inningsname;
}
public void setInningsname(String inningsname) {
	this.inningsname = inningsname;
}
public int getRuns() {
	return runs;
}
public void setRuns(int runs) {
	this.runs = runs;
	}
public void displayInningsDetails(int runs1, String session1)
{
	if(inningsname.equalsIgnoreCase(end))
	{
		System.out.println("match end");
	}
	else
	{
		int runNeed= runs1+1;
		System.out.println("Needs "+runNeed + "to win");
		
	}
}

}
