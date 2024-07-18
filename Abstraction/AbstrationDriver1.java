class Parent
{
	private abstract void m1();
}
class child extends Parent
{
	public void m1()
	{
		System.out.println("Hello");
	}
}
class AbstrationDriver1
{
	public static void main(String[] args) {
	
	
	Child obj=new Child();
	obj.m1();
}
}