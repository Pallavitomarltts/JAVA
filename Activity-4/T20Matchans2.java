
public class T20Matchans2 extends Matchans2{

	
		public double calculateRunRate( int currentscore, float currentover) {
			return currentscore/currentover;
			
			
		}

		public float calculateBalls( float currentover) {
			// TODO Auto-generated method stub
			return (120-(currentover*6));
			
		}
		public double display(int currentscore,int target) {
			return target-currentscore;
		}

		
	}

