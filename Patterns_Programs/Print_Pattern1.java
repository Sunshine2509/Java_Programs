// Hollow Square
 
class Print_Pattern1
{
	// Main Method

	public static void main(String args[])
	{
		// Outer loop 

		for ( int i=1; i<=6 ; i++)

		{	// inner loop

			for( int j=1; j<=6; j++)
			{
				// Condition 

				if (i==1 || j==1 || i==6 || j==6|| j==(6-i+1)||i==j)
				
				{
				System.out.print(" "+"1");
				}  
				                                				
				 else 
				{
					System.out.print(" "+" ");
				} 
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

