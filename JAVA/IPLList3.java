package com.ltts.exception;

import java.util.LinkedList;
import java.util.Scanner;

public class IPLList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		LinkedList ll= new LinkedList();
		LinkedList ll1= new LinkedList();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		String p1= sc.nextLine();
		String p2= sc.nextLine();
		String p3= sc.nextLine();
		String p4= sc.nextLine();
		String p5= sc.nextLine();
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.add(p4);
		ll.add(p5);
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		String pp1= sc.nextLine();
		String pp2= sc.nextLine();
		String pp3= sc.nextLine();
		String pp4= sc.nextLine();
		String pp5= sc.nextLine();
		ll1.add(pp1);
		ll1.add(pp2);
		ll1.add(pp3);
		ll1.add(pp4);
		ll1.add(pp5);
		System.out.println("Consistent run scorers");
		for(Object s1:ll1)
		{
			if(s1.equals(p1)||s1.equals(p2)||s1.equals(p3)||s1.equals(p4)||s1.equals(p5))

			{
				System.out.println(s1);
			}
		}
	}

}
