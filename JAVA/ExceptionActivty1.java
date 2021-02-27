package com.ltts.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionActivty1 {
		   
		 
	    public static void main(String[] args) throws IOException {
	        try{
	            int runs,overs;
	            float runRate;
	            
	            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	            
	            ExceptionActivty1 obj=new ExceptionActivty1();
	            System.out.println("Enter Runs Scored: ");
	            runs = Integer.parseInt(scan.readLine());
	            System.out.println("Enter the over faced: ");
	            overs = Integer.parseInt(scan.readLine());
	            runRate=runs/overs;
	            System.out.println("current runrate  :"+runRate);
	         
	           overs= Integer.parseInt(scan.readLine());
	        }
	        catch(Exception e){
	            System.out.println("Exception "+e);
	            System.exit(0);
	        }
	       
	     
	    }
	}
