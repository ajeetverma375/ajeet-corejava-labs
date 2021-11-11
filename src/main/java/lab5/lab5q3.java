package lab5;
import java.util.Scanner;

// Create an Exception class named as “EmployeeException”(User defined Exception)
// in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. 
// Use Exception Handling mechanism to handle exception properly.
import com.cg.eis.exception.*;
   
public class lab5q3 {
	public static void main(String[] args)

	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary");
        int salary=sc.nextInt();
        sc.close();
        
        try
        {
        	if(salary<3000)
        	{
        		throw new EmployeeException("Your Salary is below 3000");
        	}
        	else
        	{
        		System.out.println("you salary is above 3000");
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
