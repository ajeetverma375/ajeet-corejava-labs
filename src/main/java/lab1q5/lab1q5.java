package lab1q5;

//Create a class with a method which can calculate the sum of
//first n natural numbers which are divisible by 3 or 5.
//
//Method Name      	calculateSum 
//Method Description 	Calculate Sum 
//Argument 	        int n 
//Return Type 	    int-sum 
//Logic 	Calculate the sum of first n natural numbers which are divisible by 3 or 5. 


public class lab1q5 {
	public static void main(String[] args) 
	{
    lab1q5 ref=new lab1q5();
    System.out.println(ref.calculateSum(50));
	}

	 int calculateSum(int n)
	{
	    int Sum1, Sum2, Sum3;
	 
	    Sum1 = ((n / 3)) * (2 * 3 + (n / 3 - 1) * 3) / 2;    // arithmetic progeression formula
	    Sum2 = ((n / 5)) * (2 * 5 + (n / 4 - 1) * 5) / 2;
	    Sum3 = ((n / 15)) * (2 * 15 + (n / 15 - 1) * 15) / 2;
	 
	    return Sum1 + Sum2 - Sum3;
	}
}
