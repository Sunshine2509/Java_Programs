/* Write a java programm to print all even multiple of 3 and 5 within ranged of 200.*/

class Print_Even_Multiple
{
	//Main method 

	public static void main(String args[])
	{

		// initialization 

		int n=1;
		do
		{
			// logic 

			if(n%3==0 && n%5==0)
			{
				if(n%2==0)
				{
					System.out.println(n);
				}
			}

			// updation	
			n++;

		}while(n<=200);	// condition
	}
}


	/* Output: 

	Compile Time: Success 

	Runtime : Success and   30
				60
				90
				120
				150
				180 */
