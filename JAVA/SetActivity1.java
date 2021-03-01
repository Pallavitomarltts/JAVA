package com.ltts.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class SetActivity1 {

public static void main(String args[]) throws IOException
{   
	Scanner sc=new Scanner(System.in);
HashSet s=new HashSet();
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
int no=sc.nextInt();
for(int i=0;i<no;i++)
{

String player=br.readLine();  
s.add(player);

}


System.out.println(s.size());
}
}