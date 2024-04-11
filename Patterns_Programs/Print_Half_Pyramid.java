// Half Pyramid
 
class Print_Half_Pyramid
{
	// Main Method

	public static void main(String args[])
	{
		// Outer loop 

		for ( int i=1; i<=4 ; i++)

		{	// inner loop

			for( int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
															
				
		}
						
	}
}


	/* Output: 

		Compile time : Success 

		Runtime :  ****
			   *  *
			   *  *
			   ****
			        */	

