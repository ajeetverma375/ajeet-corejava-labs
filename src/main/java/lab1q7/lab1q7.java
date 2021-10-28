package lab1q7;

//: Create a method to check if a number is an increasing number
//Method Name 	     checkNumber 
//Method Description   Check if a number is an increasing number 
//Argument 	         int number 
//Return Type        	boolean 
//Logic 	A number is said to be an increasing number if no digit 
//is exceeded by the digit to its left. 
//For Example : 134468 is an increasing number 


public class lab1q7 {
	public static void main(String[] args) {
		lab1q7 ref = new lab1q7();
		System.out.println(ref.checkNumber(134468));
	}

	public boolean checkNumber(int n) {
		int digit1;
		boolean a = false;
		digit1 = n % 10;
		n = n / 10;
		while (n != 0) {

			if (digit1 > n % 10) {
				a = true;
				break;
			}

			digit1 = n % 10;
			n = n / 10;
		}

		return a;
	}
}
