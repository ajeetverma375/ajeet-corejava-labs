package lab1q2;
import java.util.Scanner;

//Write a java program that simulates a traffic light. 
//The program lets the user select one of three lights: red, yellow, or green with radio 
//buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go”
//should appear in the console .Initially there is no message shown.

public class lab1q2 {
	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
	System.out.println(" red \n yellow \n green");
	System.out.print("enter your choice:");
	  String select=sc.nextLine();
	  sc.close();
	  switch(select)
	  {
	  case "red": System.out.println("stop");
	  break;
	  case "yellow": System.out.println("ready");
	  break;
	  case "green": System.out.println("go");
	  break;
	  default:
		  break;
	  }
	}
}
