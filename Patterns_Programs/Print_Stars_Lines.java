 class Print_Stars_Lines
{
	// Main Method

	public static void main(String args[])
	{
		// Outer loop 

		for ( int i=1; i<=5   ; i++)

		{	// inner loop

			for( int j=1; j<=5; j++)
			{
				// Condition 

				if (i==1 || j==1)
				
				{
				System.out.print(" * ");
				} 
				/* else 
				{
					System.out.print(" ");
				} */
			} System.out.println();
			
				
		}
						
	}
}


	/* Output: 

		Compile time : Success 

		Runtime :  * * * * *
			   *
			   *
			   *
			   *      */	

