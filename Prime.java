import java.util.*;
class Prime
{
	public static void main(String args[])
{
	int n,count=0;
	System.out.print("enter the number ");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	
	for(int i=1; i<=n; i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	
	if(count==2)
	System.out.println("Prime Nunber is: ");
	else
	System.out.println("not prime Number: ");
	
}
}
