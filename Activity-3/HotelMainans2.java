import java.util.Scanner;
public class HotelMainans2 {



		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			HotelRoomans2 hr=new HotelRoomans2 ();
			DeluxeRoomans2 dr=new DeluxeRoomans2();
			DeluxeACRoomans2  dar=new DeluxeACRoomans2();
			SuitAcroomans2 sar=new SuitAcroomans2();
			System.out.println("Hotel Tariff Calculator");
			System.out.println("1. Deluxe Room");
			System.out.println("2. Deluxe AC Room");
			System.out.println("3. Suite AC Room");
			System.out.println("Select Room Type:");
			int choice=sc.nextInt();
			if(choice==1||choice==2||choice==3)
			{
				Scanner sc1=new Scanner(System.in);
				DeluxeRoomans2 dr1=new DeluxeRoomans2();
				HotelRoomans2 hr1=new HotelRoomans2 ();
				System.out.println("Hotel Name:");
				String Hname=sc1.next();
				dr1.setHotelName(Hname);
				
				System.out.println("Room Square Feet Area:");
				int sqrarea=sc1.nextInt();
				dr1.setNumberOfSqFeet(sqrarea);
				
				System.out.println("Room has TV (true/false):");
				boolean tv=sc1.nextBoolean();
				dr1.setHasTV(tv);
				
				System.out.println("Room has Wifi (true/false):");
				boolean wifi=sc1.nextBoolean();
				dr1.setHasWifi(wifi);
				int rate=hr.getRatePerSqFeet1(wifi, sqrarea);
				System.out.println("Room Tariff per day is:"+hr1.getRatePerSqFeet1(wifi, sqrarea)+hr1.calculateTariff(rate, sqrarea));
			}
			
			

		}

	}
