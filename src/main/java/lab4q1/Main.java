package lab4q1;

public class Main 
{
    public static void main(String[] args) {
    	
		Account p=new Person("Smith",24f,8956274l, 10000d, "Smith" );
		Person p1=new Person("Kathy",30f,895627434l, 15000d , "Kathy");
		System.out.println(p);
		//Account acc=new Account();
		System.out.println(p.getBalance());
		SavingsAccount ref=new SavingsAccount();
		ref.withdraw(3000d);
	}
}
