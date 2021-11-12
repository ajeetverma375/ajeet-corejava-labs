package lab4q1;

public class SavingsAccount extends Account
 {
	public SavingsAccount()
	{} 

//	public SavingsAccount(long accNum, Double balance, String accHolder)
//	{
//		super(accNum, balance, accHolder);
//		// TODO Auto-generated constructor stub
//	}

	final double minBalance = 2000;

	public void withdraw(Double withdrawAmt)
	{System.out.println(getBalance());
		System.out.println(Balance-withdrawAmt);
		if(0>Balance-withdrawAmt)
		{
			System.out.println("Please maintain the minimum balance");
		}
		else 
		{
			Balance-=withdrawAmt;
		}
	}
}
