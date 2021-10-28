package lab3q6;

//Create a method that accepts a String and checks if it is a positive string.
//A string is considered a positive string, if on moving from left to right 
//each character in the String comes after the previous characters in the 
//Alphabetical order. For Example: ANT is a positive String (Since T comes 
//after N and N comes after A). The method should return true if 
//the entered string is positive.


public class lab3q6 {
	public static void main(String[] args)
	{
	String str="abcdef";
	System.out.println(PositiveString(str));

	}

	public static Boolean PositiveString(String str)
	{
	str.toLowerCase();
	   int count=0;
	for(int i=0;i<str.length();i++)
	{
	//System.out.println((int)str.charAt(i));
	if(i<str.length()-1 && (int)str.charAt(i) < (int)str.charAt(i+1))
	{
	count++;
	}
	
	}
	count++;
	if(count==str.length())
	return true;

	return false;
	}

}
