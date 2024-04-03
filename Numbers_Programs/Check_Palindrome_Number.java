/* A Java program to  take input  of a number N  and check if the reverse of N is  same as that of   N
 if yes  print palindrome. */


class Check_Palindrome_Number
{
	public static void main(String args[])
	{
		int N=121;
		int rem=0;
		int rev_num=0;
		int temp=N;
		do
		{
			rem=N%10;
			rev_num=(rev_num*10)+rem;
			N=N/10;
		}while(N>0);
		if(temp==rev_num)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}

	/* Output: 
		
		Compile Time: Success 
		Runtime : Success and Number is palindrome */