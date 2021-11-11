package lab5;

import java.util.Scanner;

// Validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.

class NotEligible extends Exception
{
   NotEligible(String msg)	
   {
	   super(msg);
   }
}
public class lab5q3 
{
    public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
     System.out.println("Enter age");
     int age=sc.nextInt();
     try
     {
    	 if(age<15)
    	 {
    		 throw new NotEligible("Not Eligible");
    	 }
    	 else
    	 {
    	    System.out.println("Congrats! you are eligible");	 
    	 }   
    	 }catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 }
     
		
	}

