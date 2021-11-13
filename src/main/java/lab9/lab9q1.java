package lab9;

import java.util.Scanner;

//Write a lambda expression which accepts x and y numbers and return xy.
public class lab9q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		double y = sc.nextInt();
		Calculate power = (a, b) -> Math.pow(x, y);
		System.out.println("Result is: " + power.calulatePower(x, y));
	}
}

interface Calculate
{
	public abstract double calulatePower(double x, double y);
}