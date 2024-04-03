/* Java Program, to print Fibonacii Series */

class Print_Fibonacii_Series
{
	public static void main(String args[])
	{
		int num1=0;
		int num2=1;
		int Sum=0;
		int range=10;
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		for(int i=1;i<=range;i++)
		{
			Sum=num1+num2;
			System.out.print(Sum+" ");
			num1=num2;
			num2=Sum;
		}
	}
}


	/* Output : 

		Compile time : Success 

		Runtime : 0 1 1 2 3 5 8 13 21 34 55 89  */