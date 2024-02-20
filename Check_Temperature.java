//Java program to check the range of given temperature.

class Check_Temperature
{
	//This is main method
	public static void main(String[]args)
	{
		//Declaration and initialization of variable.
		double temp=14;
		
		//Checking condition using Ternary(Conditional) Operater.
		String Result=(temp>=0&&temp<=10.00)?("Temperature is very cold"):((temp>10&temp<=20)?(" Temperature is cold"):(temp>20&&temp<=30)?("Temperature is moderate"):(temp>30&&temp<=40)?("Temperature is hot"):(temp>40&&temp<=50)?("Temperature is very hot"):("Please enter valid temperature"));
	
		//Printing the result
		System.out.println(Result);

	}
}



	/* Output: 

		Compile Time: Success

		Runtime: Success and Temperature is cold. */
