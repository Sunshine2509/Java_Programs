/* Java program to check the number is Automorphic or not.

	Automorphic number :  A number is called an Automorphic number if and only if its square ends in the same digits as the number itself. */

class Check_Automorphic_Number
{
	public static void main(String args[])
	{
		int num=25;
		int num_sqr=num*num;
		while(num>0)
		{
			int rem1=num%10;
			int rem2=num_sqr%10;
			if(rem1==rem2)
			{

			}
			else 
			{
				System.out.println(" Not a Automorphic number");
				break;
			}
			num=num/10;
			num_sqr=num_sqr/10;

		}
		if(num==0)
		{
			System.out.println("Automorphic number");
		}
	}
}


	/* Output : 

		Compile time : Success 
		Runtime : Automorphic number  */