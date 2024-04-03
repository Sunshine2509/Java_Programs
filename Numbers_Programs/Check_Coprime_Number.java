// Co-prime numbers: Co-prime numbers are pairs of numbers that do not have any common factor other than 1.


class Check_Coprime_Number

{
	// Main method 

	public static void main(String args[])
	{
		//Declaration and initialization of variable

		int num1=5;
		int num2=7;
		int i;
		int smallest = (num1<num2)?(num1):(num2);
		
		// for loop

		for(i =smallest; i>0;i=i/2)
		{

			// condition for checking divisor

			if(num1%i==0 && num2%i==0)
			{
				break;
			}
		}
		// condition for highest divisor 

		if(i==1)
		{
			System.out.println("Co-prime numbers");
		}
		else
		{
			System.out.println("Not Co-prime numbers");
		}
	}
}


	/*Output :

		Compile time: Success 
		Runtime : Success and Co-prime numbers */ 