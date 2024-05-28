import java.util.*;
class Test1
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of integers to be entered");
	int n=sc.nextInt();
	int m,se=0,so=0;
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter the number");
		m=sc.nextInt();
		if(m%2==0)
		{
			se=se+m;
		}
		else
                   {
			so=so+m;
		   }
	}
	
	System.out.println("Sum of even integers="+se);
	System.out.println("Sum of odd integers="+so);
}
}
	