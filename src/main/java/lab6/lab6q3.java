package lab6;


import java.util.HashMap;
import java.util.Map;

// Create a method which accepts an array of numbers and 
// returns the numbers and their squares in Hashmap
//Method Name	getSquares
//Method Description	Accepts a list of numbers and return their squares
//Argument             	int[]
//Return Type	        Map
//Logic	Iterate through the list, find the square of each
//number and add the elements to a map object
//with the number as the key and the square as the value

public class lab6q3 {
	public static void main(String[] args) 
	{
		int arr[] = { 2, 5, 5, 2, 7, 9, 4, 23, 56, 78, 20 };
		System.out.println(getSquares(arr));
	}

	public static Map<Integer, Integer> getSquares(int[] arr) 
	{
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int sq = 1;
		for (int num : arr) 
		{
			if (m.containsKey(num)) 
			{
				continue;
			} else
			{
				sq = num * num;
				m.put(num, sq);
			}
		}
		return m;
	}
}





