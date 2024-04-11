// Hollow Square
 
class Print_Hollow_Square
{
	// Main Method

	public static void main(String args[])
	{
		// Outer loop 

		for ( int i=1; i<=4 ; i++)

		{	// inner loop

			for( int j=1; j<=4; j++)
			{
				// Condition 

				if (i==1 || j==1 || i==4 || j==4)
				
				{
				System.out.print("*");
				} 
				 else 
				{
					System.out.print(" ");
				} 
			} System.out.println();
			
				
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

