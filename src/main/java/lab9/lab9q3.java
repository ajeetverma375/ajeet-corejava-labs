package lab9;
import java.util.Scanner;
//Write a method that uses lambda expression to accept username and password and 
//return true or false. (Hint: Use any custom values for username and password for authentication)
public class lab9q3 {
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter username");
      String name=sc.nextLine();
    
      Validation na=(String nam)->
      {
    	  System.out.println("reenter your username");
    	  String name1=sc.nextLine();
    	  if(name1.equals(name))
    	  {
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      };
      System.out.println(na.validateName(name));
      System.out.println("enter your password");
      String password=sc.nextLine();
      ValidatePass p=(String nam)->
      {
    	  System.out.println("reenter your password");
    	  String pass1=sc.nextLine();
    	  if(pass1.equals(password))
    	  {
    		  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      };
      System.out.println(p.validatePassword(password));
      sc.close();
	}
}

interface Validation
{	public abstract boolean validateName(String name);
   

}
interface ValidatePass
{
	public abstract boolean validatePassword(String password);	
}