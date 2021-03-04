
public class ODIMatchans2 extends Matchans2{

		public double calculateRunRate( int currentscore, float currentover) {
			return currentscore/currentover;
			
			
		}

		public float calculateBalls( float currentover) {
			// TODO Auto-generated method stub
			return (300-(currentover*6));
			
		}
		public double display(int currentscore,int target) {
			return target-currentscore;
		}


	
}
