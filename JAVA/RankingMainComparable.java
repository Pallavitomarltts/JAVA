import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RankingMainComparable  {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
				ArrayList<IPLComparable> al = new ArrayList<IPLComparable>();
				int players = Integer.parseInt(reader.readLine());
				int j=0;
				for(int i=0;i<players;i++)
				{
					System.out.println("Enter Name of Player"+j);
					String name = reader.readLine();
					System.out.println("Enter age of Player"+j);
					int age = Integer.parseInt(reader.readLine());
					al.add(new IPLComparable(age,name));
					j++;
				}
				Collections.sort(al);
				for(IPLComparable r:al)
				{
					System.out.println(+r.getName()+" "+r.getScore());
				}
	}
}