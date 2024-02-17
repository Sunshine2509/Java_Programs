class Greater_Among_Three_Numbers
{
	//Main method
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		String Result=(a>b)?((a>c)?("a is greater"):("c is greater")):((b>c)?("b is greater"):(" c is greater"));
		
     
		System.out.println(Result);
	}
}