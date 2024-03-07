// Java program , Print reverse number of the given number using do while loop.

class Do_While_Loop7
{
	// Main method
	public static void main(String args[])
	{
		// Declaration and initialization of variable.
		int num=467;
		int rem=0;
		int rev_num=0;

		// do while loop
		do
		{

			// logic for reverse number

			rem=num%10;
			rev_num=(rev_num*10)+rem;
			num=num/10;
		}while(num>0);
		System.out.println(rev_num);
	}
}

		/*Output:
		
		Compile Time: Success

		Runtime: Success and 764 */