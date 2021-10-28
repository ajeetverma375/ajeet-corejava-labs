package lab1q3;

import java.util.Scanner;


public class lab1q3 {
	Scanner sc = new Scanner(System.in);
	int a = 1, b = 1,c;

		public static void main(String[] args)
			{
			lab1q3 l=new lab1q3();	
			System.out.println("with recurssion ");
			System.out.print(l.a+" "+l.b+" ");
			l.fibo(20);
			System.out.println();
			System.out.println("without recursion");
			l.fibonacci(20);
			}
			public void fibo(int n)
			{	if(n>0)
				{
					c=a+b;
					a=b;
					b=c;
					System.out.print(c+" ");
					fibo(n-1);
				}					
	}

			   public void fibonacci(int n)
			   {int x=1,y=1,z;
				   System.out.print(x+" "+y+" ");
				   for(int i=3;i<=n;i++)
				   {
					   z=x+y;
					   x=y;
					   y=z;
					   System.out.print(z+" ");
				   }
			   }
}
