
public class Twowheelerans1 extends Vehicleans1{
private Boolean kickStartAvailable;

public Boolean getKickStartAvailable() {
	return kickStartAvailable;
}

public void setKickStartAvailable(Boolean kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}

public Twowheelerans1() {
	super();
}

public Twowheelerans1(Boolean kickStartAvailable) {
	super();
	this.kickStartAvailable = kickStartAvailable;
}

public void displayDetailInfo()
{
	System.out.println(kickStartAvailable);
}


}