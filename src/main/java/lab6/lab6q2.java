package lab6;
import java.util.HashMap;
import java.util.Map;

//Create a method that accepts a character array and count the number of times 
// each character is present in the array.
//
//Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_4]
//
//Method Name 	countChars
//Method Description 	method that accepts a character array and count the number
//                        of times each character is present in the array.
//Argument 	char[] arr
//Return Type 	Map<Character, Integer>
//Logic 	

public class lab6q2 {
	public static void main(String[] args) {
		 char[] arr= {'a','b','d','e','s','g','r','d','s','d','d','s','d','v','s'};
		System.out.println(countChars(arr));
	}

	public static Map<Character, Integer> countChars(char[] arr) 
	{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		//char[] strArray = inputString.toCharArray();
		for (char c : arr) 
		{
			if (charCountMap.containsKey(c)) 
			{
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else 
			{
				charCountMap.put(c, 1);
			}
		}

	//  List<Object> l=new ArrayList<>();
	///		  for (Map.Entry entry : charCountMap.entrySet())
	///	{
	///		System.out.println(entry.getKey() + " " + entry.getValue());
	//	    Object a= entry.getKey();
	//	    l.add(a);
	///	}
	//		  System.out.println(l);
		return charCountMap;
	}
}





