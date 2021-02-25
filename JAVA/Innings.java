public class Innings
{
String end="second";
String teamname;
public String getteamname()
{
return teamname;
}
public void setteamname(String teamname)
{
this.teamname=teamname;
}


String inningsname;
public String getinningsname()
{
return inningsname;
}
public void setinningsname(String inningsname)
{
this.inningsname=inningsname;
}


int runs;
public int getruns()
{
return runs;
}
public void setruns(int runs)
{
this.runs=runs;
}

public void displayInningsdetails(int runs1, String ses)
{
if(inningsname.equals(end))
{
System.out.println("match ended");
}
else
{
int runneed= runs1+1;
System.out.println("needs "+runneed+" to win");
}
}
}
