class Factorial
{
	static int num=5;
	static int fact=1;
	public static void main(String args[])
	{
		find_Factorial();
		System.out.print(fact);
	}
	
	public static void find_Factorial()
	{
		fact=fact*num;
		num--;
		
		if(num==0)
		return;
		find_Factorial();
	}
}