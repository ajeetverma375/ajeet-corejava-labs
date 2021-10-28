package lab1q6;

//Create a class with a method to find the difference 
//between the sum of the squares and the square of the sum 
//of the first n natural numbers.
//
//Method Name 	     calculateDifference 
//Method Description 	Calculate the difference 
//Argument 	         int n 
//Return Type        	int - Sum 
//Logic 	Find the difference between the sum of the squares of 
//the first n natural numbers and the square of their sum. 
//For Example if n is 10,you have to find 
//(1^2+2^2+3^2+….9^2+10^2)- 
//(1+2+3+4+5…+9+10)^2 


public class lab1q6 {
	 public static void main(String[] args) {
			lab1q6 l=new lab1q6();
			System.out.println(l.calculateDifference(10));
		}
		  int calculateDifference(int n)
		 {int sum1=0,sum2=0;
		 int i=1;
			 for(;i<=n;i++)
			 {
				 sum1=sum1+(int) Math.pow(i,2);
				 sum2=sum2+i;
			 }
			 int diff=sum1-sum2*sum2;
		    
			return diff;
		 }
}
