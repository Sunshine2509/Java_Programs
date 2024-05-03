
// Java program to check whether a number is prime or not using user-defined method (Recursion).

class Check_Prime
{
	// static variables
	static int num = 21;
	static int i=2;
	static int count =0;

	// main method (calling method)

	public static void main(String [] args)
	{
		primeNumber();
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}

		
		
	}

	// user-defined method (called method)

	public static void primeNumber()
	{
		if(num==i)
		return;

		if(num%i==0)
		{
			count++;
		}
		i++;
		
		
		if(i==num)
		return;
	
		primeNumber();

	}
}  

	/* Output : 

		Compile time : Success 

		Runtime : Success and Not prime number  */


		class Print_First10_Prime_Numbers
		{
			static int num=2;
				
			public static void main(String[] args) {
				int count =0;
				for(int i=1;count<10;i++){
					if (prime())
					{
						System.out.print(num +" ");
						count++;
					}
					num++;
				}
				
			}

			public static boolean prime()
			{
				boolean flag =true;
				for(int i=2; i<=num/2;i++)
				{
					if(num%i==0)
					{
					flag=false;
					break;
					}
				}
				return flag;
				
				
				

			}
		}

		class Pattern_Of_Prime_Number
		{
			static int num=2;
				
			public static void main(String[] args) {
			]\\
				int count =0;
				for(int i=1;count<10;i++){
					if (prime())
					{
						System.out.print(num +" ");
						count++;
					}
					num++;
				}
				
			}

			public static boolean prime()
			{
				boolean flag =true;
				for(int i=2; i<=num/2;i++)
				{
					if(num%i==0)
					{
					flag=false;
					break;
					}
				}
				return flag;
		}