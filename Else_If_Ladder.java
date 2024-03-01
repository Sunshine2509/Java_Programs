// Java program to make Grading System using Else if ladder

class Else_If_Ladder
{
	//Main method

	public static void main(String[]args)
	{
		//Declaration and initialization of variable

		int marks=90;
		
		// check the marks criteria using else if ladder

		if(marks<=100 && marks>=90)
		{
			System.out.println("A");
		}
		else if(marks<90 && marks>=75)
		{
			System.out.println("B");
		}
		else if(marks<75 && marks>=60)
		{
			System.out.println("C");
		}
		else if(marks<60 && marks>=35)
		{
			System.out.println("D");
		}
		else if(marks<35 && marks>=0)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println(" Marks are not in valid range");
		}
	}
}

	/* Output: 

	Compile Time: Success

	Runtime : Success and A */
