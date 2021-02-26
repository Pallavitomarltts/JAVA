
public class FourWheeler {

	private String audiosystem;
	private int noofdoors;
	
	
	
	
	public FourWheeler() {
		super();
	}
	public FourWheeler(String audiosystem, int noofdoors) {
		super();
		this.audiosystem = audiosystem;
		this.noofdoors = noofdoors;
	}
	public String getAudiosystem() {
		return audiosystem;
	}
	public void setAudiosystem(String audiosystem) {
		this.audiosystem = audiosystem;
	}
	public int getNoofdoors() {
		return noofdoors;
	}
	public void setNoofdoors(int noofdoors) {
		this.noofdoors = noofdoors;
	}
	
	public void displaydetailsinfo()
	{
		System.out.println(audiosystem);
		System.out.println(noofdoors);
	}
	
	
	
}
