	import java.util.Scanner;
public class Shapemainans1 {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Circle");
			System.out.println("Square");
			System.out.println("Enter the shape");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("Circle"))
			{
				Circleans1 c=new Circleans1();
				System.out.println("Enter the radius");
				double rad=sc.nextDouble();
				c.setValue(rad);
				System.out.print("Area of circle is: ");
				System.out.printf("%1$.2f", c.calculateArea(rad));
				
			}
			if(choice.equalsIgnoreCase("Square"))
			{
				Squareans1 s=new Squareans1();
				System.out.println("Enter the side");
				double side=sc.nextDouble();
				s.setValue(side);
				System.out.println("Area of Square is: "+s.calculateArea(side));
				
			}
		}
	}
