package lab2q1;

import java.util.Scanner;

// print second largest number from array

public class lab2q1 
{

	public int secondLargest(int[] arr) 
	{
		int large = Integer.MIN_VALUE;
		int slarge = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (large < arr[i]) {
				slarge = large;
				large = arr[i];
			}
			else if (arr[i] > slarge && arr[i] != large)
			{
				slarge = arr[i];
			}
		}

		return slarge;
	}
    
	//Driver 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		lab2q1 ref = new lab2q1();
		System.out.println("second largest num is: " + ref.secondLargest(arr));
		sc.close();
	}

}
