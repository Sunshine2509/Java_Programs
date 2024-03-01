// Java program to check that a person is eligible for scholarship or not.

class Nested_If_Else
{
	//Main method

	public static void main(String args[])
	{
		// Declaration and initialization of variable

		int ExamMarks=80 , Marks=91;

		// checking criteria using nested if else

		if(Marks>90)
		{
			System.out.println("Allowed for scholarship exam");
			if(ExamMarks>80)
			{
				System.out.println("Get 20% of on his admission fees");
			}
			else
			{
				System.out.println("Sorry, no discount");
			}
		}
		else
		{
			System.out.println("Not allowed for scholarship exam");
		}	
	}
}

	/* Output: 

	Compile time: Success 

	Runtime : Success and Allowed for scholarship exam
			      Sorry, no discount */
