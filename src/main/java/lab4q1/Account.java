package lab4q1;

public class Account {
	   private long accNum;
	   private Double Balance;
	   private String accHolder;
	public Account(long accNum, Double balance, String accHolder) {
		super();
		this.accNum = accNum;
		Balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", Balance=" + Balance + ", accHolder=" + accHolder + "]";
	}

}
