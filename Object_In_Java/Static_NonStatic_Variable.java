class Static_NonStatic_Variable
{
	String str="HII I am from Static_NonStatic_Variable";
	public static void main(String[] args) {
		System.out.println("Hello From Main");
		Static_NonStatic_Variable1 obj=new Static_NonStatic_Variable1();
		obj.m1();

	}
}
class Static_NonStatic_Variable1
{
	static Static_NonStatic_Variable obj=new Static_NonStatic_Variable();
	void m1()
	{
		System.out.println("Hii from m1()");
		System.out.println(obj.str);
		m2();

	}
	void m2()
	{
		System.out.println("Hii from m2()");
		System.out.println(obj.str);
		m3();

	}
	static void m3()
	{
		System.out.println("Hii I am from m3()");
		System.out.println(obj.str);
	}
}