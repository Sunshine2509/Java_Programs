/* Java program, to check the number is buzz or not . 

	Buzz number : Buzz numbers are those numbers that are divisible by seven or end with seven.  */

class Check_Buzz_Number 
{
	public static void main(String args [])
	{
		int num = 7;
		if(num%7==0 || num%10==7)
		{
			System.out.println("Buzz number");
		}
		else 
		{
			System.out.println("Not a buzz number");
		}
	}
}


	/* Output : 

		Compile time : Success 

		Runtime : Buzz number  */
