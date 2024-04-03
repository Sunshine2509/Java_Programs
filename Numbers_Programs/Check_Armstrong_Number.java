/* Armstrong Number : In Java, a number is said to be an Armstrong number if the sum of its own digits raised to a power of digits results in the number 			
		      itself.  */


class Check_Armstrong_Number
{
	public static void main(String args[])
	{
		int num =153;
		int copy_num1=num;
		int copy_num2=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(copy_num1>0)
		{
			int rem=copy_num1%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			copy_num1=copy_num1/10;
		}
		if(sum==copy_num2)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}
}


	/* Output:

		Compile time: Success

		Runtime : Armstrong number  */ 
