/* write  a programme to check if the year is leap year or not.*/

class Check_Leap_Year
{
	//Main method

	public static void main(String args[])
	{
		//Declaration and initialization of the variable

		int year=2024;

		// condition for checking leap year

		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}
}


	/* Output: 

	Compile Time: Success 

	Runtime : Success and Leap Year */
