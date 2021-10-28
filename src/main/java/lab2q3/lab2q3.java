package lab2q3;

import java.util.Arrays;

// Create a method which accepts an integer array,
//  reverse the numbers in the array and returns the resulting array
//  in sorted order
//Method Name 	    getSorted 
//Method Description 	Return the resulting array after reversing
//                      the numbers and sorting it 
//Argument         	int [] 
//Return Type      	int 
//Logic 	Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
//Hint 
//Convert the numbers to String to reverse it 
//
//
public class lab2q3 {
	public static void main(String[] args)
	{
	int[] a= {17,16,21};
	System.out.print("original array: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	int[] c=getSorted(a);
	System.out.println("sorted array: "+Arrays.toString(c));
	}
	public static int[] getSorted(int[] a)
	{   for(int i=0;i<a.length;i++)
		{int b=a[i];
		int rev=0;
			while(b!=0)
			{rev=rev*10+b%10;
				b=b/10;
			}
			a[i]=rev;
		}
		System.out.println("\nreversed digit: "+Arrays.toString(a));
		Arrays.sort(a);
	//	System.out.println(Arrays.toString(a)+" *");
		return a;
	}
}
