import java.util.Comparator;
public class Playercomparatorans1 implements Comparator<Playerans1> {


		@Override
		public int compare(Playerans1 p1,Playerans1 p2) {
			 
	        if(p1.getSkill().compareTo(p2.getSkill())==0)
	        		{
	        	 return p1.getName().compareTo(p2.getName());
	        		}
	        else
	        { 
			 return p1.getSkill().compareTo(p2.getSkill());
		 
		    }
		
	}
	}
