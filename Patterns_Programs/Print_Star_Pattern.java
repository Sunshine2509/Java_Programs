class Print_Star_Pattern
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			// loop for spaces
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			// loop for stars
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
}

/*Output : 

Compile Time : Success 
Runtime : 

 * * * * *
   * * * *
     * * *
       * *
         * 		*/


/*
class Print_Star_Pattern
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			// loop for stars
			for(int k=5;k>=i;k--)
			{
				System.out.print(" * ");

			}

			// loop for spaces      ( This loop is optional )
			//for(int j=1;j<=i;j++)
			//{
			//	System.out.print(" ");
			//}
			System.out.println();
		}
	}
}

Output : 

Compile Time : Success 
Runtime : 

* * * * *
* * * *
* * *
* *
*	*/


/* class Print_Star_Pattern
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			// loop for spaces
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			// loop for stars
			for(int k=1;k<=i;k++)
			{
				System.out.print(" * ");

			}
			System.out.println();
		}
	}
}

*/

/*Output : 

Compile Time : Success 
Runtime :

	     *
       * *
     * * *
   * * * *
 * * * * *	*/

/*class Print_Star_Pattern
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			// loop for stars
			for(int k=1;k<=i;k++)
			{
				System.out.print(" * ");

			}

			// loop for spaces      ( This loop is optional )
			//for(int j=1;j<=i;j++)
			//{
			//	System.out.print(" ");
			//}
			System.out.println();
		}
	}
}

*/
/* Output : 

Compile Time : Success 
Runtime : 

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *		*/



