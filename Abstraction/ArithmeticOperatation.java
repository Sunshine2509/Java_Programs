abstract class Parent
{
	abstract int addition(int a, int b);
	abstract int substration(int a, int b);
	abstract int multiplication(int a, int b);
	abstract int division(int a, int b);
	abstract int modulus(int a, int b);

}

 class Child extends Parent
{
	 int addition (int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	 int substration (int a, int b)
	{
		int sub=a-b;
		return sub;
	}
	 int multiplication (int a, int b)
	{
		int product=a*b;
		return product;
	}
	 int division (int a, int b)
	{
		int quotient=a/b;
		return quotient;
	}
	 int modulus (int a, int b)
	{
		int rem=a%b;
		return rem;
	}
}

class ArithmeticOperatation
{
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println(obj.addition(2,4));
		System.out.println(obj.substration(4,3));
		System.out.println(obj.multiplication(4,5));
		System.out.println(obj.division(2,1));
		System.out.println(obj.modulus(2,1));
		
	}
}