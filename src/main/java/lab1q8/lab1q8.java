package lab1q8;

//Create a method to check if a number is a power of two or not
//
//Method Name       	checkNumber 
//Method Description 	Checks if the entered number is a power of two or not 
//Argument 	        int n 
//Return Type 	    boolean 
//Logic 	Check if the input is a power of two. 
//Ex: 8 is a power of 2 



public class lab1q8 {
	public static void main(String[] args) 
	{
		lab1q8 ref=new lab1q8();
		System.out.println(ref.checkNumber(8));
	}
	boolean checkNumber(int n)
	{
		for(int i=1;i<=n;i++)
		{  int a=(int) Math.pow(2, i);
			if(n==a)
			{return true;}
		}
		
		return false;
	}
}
