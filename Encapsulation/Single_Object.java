class Student 
{
	String name;
	String branch;

	private Student(String name, String branch)
	{
		this.name=name;
		this.branch=branch;
	}
	public static Student createObject()
	{
		Student obj=new Student();

	}
}

class Single_Object
{
	public static void main(String[] args) {
			Student obj=null;
			if(obj==null)
			{
				createObject();
		}
		else{
			return 
		}
		
		
	}
}