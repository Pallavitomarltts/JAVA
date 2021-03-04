import java.util.Comparator ;
public class Teamcomparatorans2 implements Comparator<Teamans2>{

	@Override
	public int compare(Teamans2 t1, Teamans2 t2) {
		// TODO Auto-generated method stub
		if(t1.getNoofmatches() == t2.getNoofmatches())
		{
			return 1;
		}
		else if(t1.getNoofmatches() > t2.getNoofmatches())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}	
	}
