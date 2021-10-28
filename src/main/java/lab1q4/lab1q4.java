package lab1q4;
import java.util.Scanner;

// range of prime numbers 

public class lab1q4 {
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter range ");
	
	int range=sc.nextInt();
	sc.close();
	for(int i=1;i<=range;i++)
	{   int t=0;
		for(int j=2;j<=i;j++)
	{
		if(i%1==0 && i%j==0)
		{
			t=t+1;
		
			}
	}
	if(t==1)
	{System.out.print(i+" ");}
	
	}

}
}
