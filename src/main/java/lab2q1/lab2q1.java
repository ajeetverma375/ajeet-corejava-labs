package lab2q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// print second largest number from array

public class lab2q1 
{

	public int secondSmallest(int[] arr) 
	{
		Arrays.sort(arr);
return arr[1];
	}
    
	
	
	
	//Driver 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{System.out.println("enter value");
			arr[i] = sc.nextInt();
		}
		lab2q1 ref = new lab2q1();
		System.out.println("second smallest num is: " + ref.secondSmallest(arr));
		sc.close();
	}

}
