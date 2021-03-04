
public class DeluxeRoomans2 extends HotelRoomans2{
		protected int ratePerSqFeet ;


		public DeluxeRoomans2() {
			super();
		}

		public DeluxeRoomans2(int ratePerSqFeet) {
			super();
			this.ratePerSqFeet = 10;
		}

		public int getRatePerSqFeet() {
			return ratePerSqFeet;
		}

		public void setRatePerSqFeet(int ratePerSqFeet) {
			this.ratePerSqFeet = ratePerSqFeet;
		}
		public int getRatePerSqFeet1(boolean hasWifi,int ratePerSqFeet)
		{
			if(hasWifi==true)
			{
				
				return (ratePerSqFeet + 2); 
				
			}
			else
			{
				
				return ratePerSqFeet;
			}
			
		}
			
		}
