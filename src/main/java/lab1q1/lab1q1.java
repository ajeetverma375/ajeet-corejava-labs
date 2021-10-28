package lab1q1;

public class lab1q1 {
	public static void main(String[] args) {
		lab1q1 l=new lab1q1();
		l.cube(123);

	}
	public void cube(int n) 
	{  int digit;
	int sum=0;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+(int) Math.pow(digit, 3);
		    n=n/10;
		}
		System.out.println("cube of digit is "+sum);
	}
}
