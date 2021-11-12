package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Create a method which accepts an integer array, reverse the numbers in the array and 
// returns the resulting array in sorted order

//Method Name 	        getSorted 
//Method Description 	Return the resulting array after reversing the numbers and sorting it 
//Argument          	int [] 
//Return Type       	int 
//Logic              	Accept and integer array, reverse the numbers in the array, sort it and 
//                      return the resulting array. 
//Hint 
//1. Convert the numbers to String to reverse it 
//2. Use Collection APIs to sort it 

public class lab6q7 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 3, 7, 9, 6, 4, 223, 34, 65, 23, 56, 0, -56, -2, -67 };
		System.out.println(getSorted(arr));
	}

	public static List<Integer> getSorted(Integer[] arr) {
		Collections.reverse(Arrays.asList(arr));
		Arrays.sort(arr);
		return Arrays.asList(arr);
	}
}
