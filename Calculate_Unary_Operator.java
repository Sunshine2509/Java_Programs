class Calculate_Unary_Operator
{
	//Main method
	public static void main(String args[])
{
	//Declaration and Initialization of variable
	int a=10, b=20, c=30;
	
	int ans1=++a-a+++b---b+c+a+a+--c+a+--b+--c;
	int ans2=c+c+c+++c+b---b+a-b+c+--b+ ++c;
	//Print the output
	System.out.println(ans1);
	System.out.println(ans2);
}
}

/* Output :
1: Compile Time: Success
2: RunTime: Success and 142 and 184 */