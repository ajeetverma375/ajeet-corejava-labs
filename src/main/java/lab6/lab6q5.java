package lab6;



import java.util.Arrays;

//Create a method which accepts an array of integer elements
// and return the second smallest element in the array
//
//Method Name 		getSecondSmallest 
//Method Description 		Get the second smallest element in the array 
//Argument 		int[] 
//Return Type 		int 
//Logic 		Sort the array and return the second smallest element 
// in the array Hint: 1. Convert to Array List 2. Use sort method in Collections class 


public class lab6q5
{
	public static void main(String[] args) {
	   Integer[] arr= {2,5,7,2,5,4,3,21};
		System.out.println(getSmallest(arr));
	}
   public static int getSmallest(Integer[] arr)
   { Arrays.sort(arr);
   int result=0;
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[0]!=arr[i])
	   {
		   result=arr[i];
		   break;
	   }
   }
     
	   return result;
   }
}


