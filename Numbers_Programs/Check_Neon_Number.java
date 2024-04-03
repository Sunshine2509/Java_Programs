/*  Java program, to check the number is Neon or not.

	Neon Number : A neon number is a number where the sum of digits of the square of the number is equal to the number. */

class Check_Neon_Number
{
	public static void main (String args [])
	{
 		int num =9;
		int num_sqr=num*num;
		int sum=0;
		while(num_sqr>0)
		{
			int rem=num_sqr%10;
			sum=sum+rem;
			num_sqr=num_sqr/10;
		}
		if(sum==num)
		{
			System.out.println("Neon number");
		}
		else 
		{
			System.out.println("Not a neon number");
		}
	}
}


	/* Output : 

		Compile time : Success 

		Runtime : Neon number */			

