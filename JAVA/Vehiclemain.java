import java.util.Scanner;
public class Vehiclemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		TwoWheeler tw= new TwoWheeler();
		FourWheeler fw= new FourWheeler();
      Scanner sc= new Scanner(System.in);
      System.out.println("1.Four Wheeler");
      System.out.println("2.Two Wheeler");
      System.out.println("Enter Vehicle Type:");
      int choice=sc.nextInt();
      if(choice==1)
      {
    	  Scanner sc1=new Scanner(System.in);
    	  
    	  System.out.println("Vehicle Make:");
    	  String mk= sc1.next();
    	  v.setMake(mk);
          System.out.println("Vehicle Number:");
          String vn=sc1.next();
          v.setVehiclenumber(vn);
          System.out.println("Fuel Type:");
          System.out.println("1.Petrol");
          System.out.println("2.Diesel");
          String ft=sc1.next();
          v.setFueltype(ft);
          System.out.println("Fuel Capacity:");
          int fc=sc1.nextInt();
          v.setFuelcapacity(fc);
          System.out.println("Engine CC:");
          int cc=sc1.nextInt();
          v.setCc(cc);
          System.out.println("Audio System:");
          String aud=sc1.next();
          fw.setAudiosystem(aud);
          System.out.println("Number of Doors:");
          int noofdoors=sc1.nextInt();
          fw.setNoofdoors(noofdoors);
          //---------------------------------
          System.out.println("*******"+v.getMake()+"******");
          System.out.println("---Basic Information---");
          System.out.println("Vehicle Number"+v.getVehiclenumber());
          System.out.println("Fuel Capacity"+v.getFuelcapacity());
          System.out.println("Fuel Type"+v.getFueltype());
          System.out.println("CC"+v.getCc());
          System.out.println("---Detail Information---");
          System.out.println("Audio System"+fw.getAudiosystem());
          System.out.println("Number of Doors -"+fw.getNoofdoors());
      }
      
      if(choice==2)
      {
    	  Scanner sc2=new Scanner(System.in);
    	  
    	  System.out.println("Vehicle Make:");
    	  String mk= sc2.next();
    	  v.setMake(mk);
          System.out.println("Vehicle Number:");
          String vn=sc2.next();
          v.setVehiclenumber(vn);
          System.out.println("Fuel Type:");
          System.out.println("1.Petrol");
          System.out.println("2.Diesel");
          String ft=sc2.next();
          v.setFueltype(ft);
          System.out.println("Fuel Capacity:");
          int fc=sc2.nextInt();
          v.setFuelcapacity(fc);
          System.out.println("Engine CC:");
          int cc=sc2.nextInt();
          v.setCc(cc);
          System.out.println("Kick Start Available(yes/no):");
          String ks=sc2.next();
         
          //---------------------------------
          System.out.println("*******"+v.getMake()+"******");
          System.out.println("---Basic Information---");
          System.out.println("Vehicle Number"+v.getVehiclenumber());
          System.out.println("Fuel Capacity"+v.getFuelcapacity());
          System.out.println("Fuel Type"+v.getFueltype());
          System.out.println("CC"+v.getCc());
          System.out.println("---Detail Information---");
       System.out.println("Kick Start Available - "+ks);
      }
      
      
      
     
   
      
      
      
	}

}
