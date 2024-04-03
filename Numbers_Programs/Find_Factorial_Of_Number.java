// Java program for finding the factorial of a number.

class Find_Factorial_Of_Number
{
	public static void main(String args[])
	{
		int num=5;
		int fact=1;
		int i=1;
		while (i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}

	/*  Output: 		
		
		Compile time: Success 

		Runtime : 120  */