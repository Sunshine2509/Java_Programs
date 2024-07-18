interface Arithmetic
{
	int add(int a, int b);
	int multi(int a, int b);
}
class ArithmeticImplimentation implements Arithmetic
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int multi(int a, int b)
	{
		return a*b;
	}

}
class InterfaceDriver
{
	public static void main(String[] args) {
		ArithmeticImplimentation obj=new ArithmeticImplimentation();
		System.out.println(obj.add(2,3));
		System.out.println(obj.multi(2,3));
	}
}