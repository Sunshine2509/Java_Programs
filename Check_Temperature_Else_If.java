// Java program to check the temperature using else if ladder.

class Check_Temperature_Else_If
{
	public static void main(String args[])
	{
		double temp=24.4;

		if(temp>=0&&temp<=10)
		{
			System.out.println("Very cold");
		}
		else if(temp>10&&temp<=20)
		{
			System.out.println("Cold");
		}
		else if(temp>20&&temp<=30)
		{
			System.out.println("Moderate");
		}
		else if(temp>30&&temp<=40)
		{
			System.out.println("Hot");
		}
		else if(temp>=40&&temp<=50)
		{
			System.out.println("Very hot");
		}
	}
}

	/* Output : 

	Compile time: Success 

	Runtime: Success and Moderate */