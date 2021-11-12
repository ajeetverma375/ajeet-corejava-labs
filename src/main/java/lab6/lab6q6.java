package lab6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Create a method which accepts the id and the age of people 
//as a Map and decide if they are eligible for vote. A person is eligible 
//for vote if his age is greater than 18. Add the IDs of all the eligible persons
//to list and return the list. 

//Method Name 	votersList 
//Method Description 	Generate the list of voters based on the ages of the people 
//Argument 	Map 
//Return Type 	List 
//Logic 	Accept a map with ID as key and Date of Birth as value and check if the person
//is eligible to vote.A person is eligible for vote for if his age is greater than 18. 
//If the person is eligible add his ID to the list. 

public class lab6q6 {
	public static void main(String[] args) 
  {
	Map<Integer,Integer> a =new HashMap<Integer,Integer>();
	a.put(101, 1999);
	a.put(123, 1970);
	a.put(112, 2004);
	a.put(134, 2010);
	a.put(165, 1982);
	a.put(189, 1987);
	a.put(145, 2005);
	System.out.println(votersList(a));
	
  }

	public static List<Integer> votersList(Map<Integer,Integer> a)
	{
		List<Integer> idList=new ArrayList<>();
		Set<Integer> b=a.keySet();
		for(Integer id:b)
		{
			Integer age=a.get(id);
			age=2021-age;
			if(age>18)
			{
				idList.add(id);
			}
			else
			{}
		}
		
		return idList;	
		
	}
}
