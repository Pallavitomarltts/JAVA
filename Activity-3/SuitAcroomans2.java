public class SuitAcroomans2 extends HotelRoomans2{
		private int ratePerSqFeet ;
		

		public SuitAcroomans2() {
			super();
		}

		public SuitAcroomans2(int ratePerSqFeet) {
			super();
			this.ratePerSqFeet = 15;
		}

		public int getRatePerSqFeet() {
			return ratePerSqFeet;
		}

		public void setRatePerSqFeet(int ratePerSqFeet) {
			this.ratePerSqFeet = ratePerSqFeet;
		}
		
		public int getRatePerSqFeet(boolean hasWifi,int ratePerSqFeet )
		{
			if(hasWifi==true)
			{
				return (ratePerSqFeet + 2) ;
			}
			else
			{
				return ratePerSqFeet;
			}
	
		}
		
}


