// Java program , to find the HCF (Highest Common Factor) of two numbers. 

class Find_The_Hcf
{
	public static void main (String args[])
	{
		int num1=10;
		int num2=20;
		int hcf=0;

		// find smallest number among given numbers

		int smallest=(num1<num2)?(num1):(num2);

		// for loop 

		for(int i=smallest;i<=smallest;i=i/2)
		{
			if(num1%i==0 && num2%i==0)
			{
				hcf=i;
				break;

			}
		}
		System.out.println(hcf);
	}
} 


	/* Output : 

		Compile time : Success
		Runtime :  10  */