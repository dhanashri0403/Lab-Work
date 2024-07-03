

import java.util.Scanner;

public class SwapingNumber {

	public static void main(String[] args) {
		
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");// Taking a user input.
		a=sc.nextInt();// value stored in a and b variables.
		b=sc.nextInt();
		
		System.out.println("Before Swaping number value of a is "+a+" and value of b is "+b);
		//Swaping Logic.
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping number value of a is "+a+ " and value of b is "+b);

	}

}


















