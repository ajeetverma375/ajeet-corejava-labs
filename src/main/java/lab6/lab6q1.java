package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Create a method which accepts a hash map and return the values of the map in sorted order as a List.

//Method Name 	getValues 
//Method Description 	Get the values of a map in sorted order 
//Argument 	HashMap 
//Return Type 	List 
//Logic 	Return the values of a hash map in sorted order 

public class lab6q1 {
	public static void main(String[] args) 
	{
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "Nimesh");
		hashmap.put(2, "Ashwith");
		hashmap.put(3, "Nikhil");
		hashmap.put(4, "Anmol");
		hashmap.put(5, "Vikas");
		hashmap.put(6, "Praveen");
	    System.out.println("sorted order "+lab6q1.getValues(hashmap));
	
	}
	
	public static List<String>  getValues(Map<Integer, String> h){
		
		List<String> l1 = new ArrayList<>();
		for(int i=1;i<=h.size();i++) {
			
			l1.add(h.get(i));
		}
	
	//	List<String> l2 = l1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		//System.out.println("as "+l2);
//		System.out.println(l1);
		Collections.sort(l1);
		return l1;
//		return l2;
	}
}
