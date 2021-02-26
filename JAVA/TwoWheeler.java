
public class TwoWheeler extends Vehicle 
{
  private boolean kickstartavailable;
  
  
  
  public TwoWheeler() {
	super();
}


public TwoWheeler(boolean kickstartavailable) {
	super();
	this.kickstartavailable = kickstartavailable;
}


public boolean isKickstartavailable() {
	return kickstartavailable;
}


public void setKickstartavailable(boolean kickstartavailable) {
	this.kickstartavailable = kickstartavailable;
}



public void displaydetailsinfo()
  { 
	System.out.println(kickstartavailable);
  }
  
}
