abstract class Parent
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("Hello from m3()");
	}

}
abstract class Child1 extends Parent
{
	void m1(){
		System.out.println("m1() implemented by Child1");
	}
	abstract void m4();
}
class Subchild extends Child1
{
	void m2(){
		System.out.println("m2() implemented by Subchild");
	}
	void m4(){
		System.out.println("m4() implemented by Subchild");
	}

}
class Child2 extends Parent 
{
	void m1(){
		System.out.println("m1() implemented by Child2");
	}
	void m2(){
		System.out.println("m1() implemented by Child2");
	}
	void m5(){
		System.out.println("Hello from m5()");
	}


}
class AbstrationDriver
{
	public static void main(String[] args) {
		
	
	Subchild obj1=new Subchild();

	obj1.m1();
	obj1.m2();
	obj1.m3();
	obj1.m4();
	


	Child2 obj2=new Child2();
	obj2.m1();
	obj2.m2();
	obj2.m5();
	}

}