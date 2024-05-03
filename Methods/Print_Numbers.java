// Java program to print 1 to 10 numbers using user-defined method.

class Print_Numbers
{	
	static int num=1;

	public static void main(String [] args)
	{
		printNumbers();
	}

	public static void printNumbers()
	{
		System.out.println(num);

	num++;

	if(num>10)
	return;
	printNumbers();
	}
}


/* Output : 

		Compile time : Success
		Runtime : Success and 
				   1
				   2
				   3
				   4
				   5
				   6
				   7
				   8
				   9
				   10   */