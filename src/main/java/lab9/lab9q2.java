package lab9;

//Write a method that uses lambda expression to format a given string, 

//where a space is inserted between each character of string.
//For ex., if input is “CG”, then expected output is “C G”.

import java.util.Scanner;

public class lab9q2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");

		String str = sc.nextLine();
		InsertSpace str1 = (statement) -> 
		{
			String newString = "";
			char[] c = str.toCharArray();
			for (int i = 0; i < c.length; i++)
			{
				newString += c[i] + " ";
			}
           	  String finalString = newString.toString();
			      return finalString;
		};
		System.out.println("String seperated with space "+str1.insertSpace(str));
		sc.close();
	}
}

interface InsertSpace
{
	public abstract String insertSpace(String str);
}