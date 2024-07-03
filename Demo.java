import java.util.*;

 class Student 
{
	
	
		int roll_number;
		String name;
		Scanner sc=new Scanner(System.in);
	
		void inputData()
		{
			System.out.println("Enter Roll Number:");
			roll_number=sc.nextInt();
			
			System.out.println("Enter your Name:");
			name=sc.nextLine();
			
		}
		void displayData()
		{
			System.out.println("Roll number of student is "+roll_number);
			System.out.println("Name of student is " +name);
		}
		
}



  class MarksDetails extends Student 
{
	int marks;
	
	Scanner sc1=new Scanner(System.in);
	void accept()
	{
	 	System.out.println("enter the 5 subject marks: ");
		marks=sc1.nextInt();
	
	}
	void disp()
	{
		System.out.println("subject marks: "+marks);
	}
}
 public class Demo 
{

	public static void main(String args[])
	{
	 MarksDetails s = new MarksDetails();
	s.inputData();
        s.displayData();
         int i;
	 MarksDetails M[]= new  MarksDetails[5];
	
	for(i=0;i<5;i++)
	{
		M[i]=new  MarksDetails();
		M[i].accept();	
	}
	for(i=0;i<5;i++)
	{
		
		M[i].disp();	
	}
	}
		
		
}


















	