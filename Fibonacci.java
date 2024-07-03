import java.util.*;
class Fibonacci
{
	public static void main(String args[])
{
	int number,a=1,b=2,c;
	System.out.println("Enter number");
	Scanner r=new Scanner(System.in);
	number=r.nextInt();
	for(int i=1;i<=number;i++)
	{
		System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}