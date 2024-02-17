class Greater_Among_Four_Numbers
{
	public static void main(String[]args)
	{
		int a=10,b=20,c=1000,d=40;
		/*if(a>b&&a>c&&a>d){
		System.out.println("a is greater");
		}
		else if(b>c&&b>d){
		System.out.println("b is greater");
		}else if(c>d){
		System.out.println("c is greater");
		}else{
		System.out.println("d is greater");
		}*/
		int result=(a > b && a > c && a > d) ? a : ((b > c && b > d) ? b : ((c > d) ? c : d));
		System.out.println(result);
	}
}