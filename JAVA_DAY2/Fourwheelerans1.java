
public class Fourwheelerans1 {
private String audioSystem ;
private int numberOfDoors;

public Fourwheelerans1() {
	super();
}
public Fourwheelerans1(String audioSystem, int numberOfDoors) {
	super();
	this.audioSystem = audioSystem;
	this.numberOfDoors = numberOfDoors;
}
public String getAudioSystem() {
	return audioSystem;
}
public void setAudioSystem(String audioSystem) {
	this.audioSystem = audioSystem;
}
public int getNumberOfDoors() {
	return numberOfDoors;
}
public void setNumberOfDoors(int numberOfDoors) {
	this.numberOfDoors = numberOfDoors;
}

public void displayDetailInfo()
{
	System.out.println(audioSystem);
	System.out.println(numberOfDoors);
	
}


}
