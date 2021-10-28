package lab2q2;

import java.util.Arrays;

//Exercise 2: Create a method that can accept an array of 
//String objects and sort in alphabetical order. The elements 
//in the left half should be completely in uppercase and the 
//elements in the right half should be completely in lower case.
//Return the resulting array.
//Note: If there are odd number of String objects, then (n/2) +1 
//elements should be in UPPPERCASE
//
//Method Name        	sortStrings
//Method Description 	accept an array of String objects and sort in
//                     Alphabetical order.
//Argument 	        String[] arr
//Return Type         	String 


public class lab2q2 {
	   public String[] sortStrings(String[] arr)
	    {  	Arrays.sort(arr);
	        
	    return arr;
	    }
		
		public static void main(String[] args)
		{   String[] arr= {"ORANGE","BananA","Kiwi","AppLE","GrapES","PINEapple"};
			lab2q2 ref=new lab2q2();
		String[] sorted=ref.sortStrings(arr);
		for(int i=0;i<sorted.length;i++)
		{
			System.out.print(sorted[i]+" ");
		    
		}
		System.out.println();
		for(int i=(sorted.length/2)+1;i<sorted.length;i++)
		{
			System.out.print(sorted[i].toUpperCase()+" ");
		}
		}

}
