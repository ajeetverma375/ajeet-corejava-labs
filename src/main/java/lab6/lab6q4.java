package lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//school offers medals to the students of tenth based on the following criteria 
//If(Marks>=90) : Gold 
//If(Marks between 80 and 90) : Silver 
//If(Marks between 70 and 80) : Bronze 
//Note: Marks between 80 and 90 means marks>=80 and marks<90 
//
//Write a function which accepts the marks of students as a Hashmap and
//return the details of the students eligible for the medals along with type of medal. 
//The input Hashmap contains the student registration number as key and mark as value. 
//The output Hashmap should contain the student registration number as key and the medal type as value.
//Method Name 	getStudents 
//Method Description 	Generate the list of students eligible for scholarship 
//Argument 	Hashmap 
//Return Type 	Hashmap 
//Logic 	The method should return the details of the students eligible for the medals along with the medal type. 

public class lab6q4 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Akash", 75);
		map.put("Nimesh", 85);
		map.put("Rakesh", 79);
		map.put("Anmol", 94);
		map.put("Sonu", 71);
		map.put("Tonu", 70);
		map.put("Monu", 81);
		map.put("Praveen", 90);
		System.out.println(getStudents((HashMap<String, Integer>) map));
	}

	public static HashMap<String, String> getStudents(HashMap<String, Integer> map) {
		HashMap<String, String> m = new HashMap<>();
		Set<String> set = map.keySet();
		for (String name : set) {
			Integer marks = map.get(name);
			if (marks >= 91) {
				m.put(name, "Gold");
			} else if (marks >= 81 || marks <= 90) {
				m.put(name, "Silver");
			} else if (marks >= 70 || marks <= 80) {
				m.put(name, "Bronze");
			}
		}

		return m;
	}
}
