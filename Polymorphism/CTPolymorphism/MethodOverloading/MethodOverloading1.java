final class Addition
{
	public  void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public  void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public  void add(int a, int b, int c, int d)
	{
		System.out.println(a+b+c+d);
	}

}
class MethodOverloading1
{
	public static void main(String[] args) {
		Addition obj=new Addition ();
		obj.add(2,3);
	}
}