/* write a  programm to check if the sum of digits of that number can divide the user input  number or not (print divisible if  divisible ,if not print can not divide).*/

class Check_Divisibility_Of_Sum
{
	public static void main(String args[])
	{
		int N=1234;
		int rem=0;
		int sum=0;
		int temp=N;
		do
		{
			rem=N%10;
			sum=sum+rem;
			N=N/10;
		}while(N>0);
		if(temp%sum==0)
		{
			System.out.println("Number is divisible by it's digit sum");
		}
		else
		{
			System.out.println("Number is not divisible by it's digit sum");
		}
	}
}

	/* Output: 
		
		Compile Time: Success 
		Runtime : Success and Number is palindrome */