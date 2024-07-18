class SoftwareEngineer
{
	String role;
	String skills;
	double experience;
	double salary;

	SoftwareEngineer(String role,String skills, double experience, double salary)
	{
		super();
		this.role=role;
		this.skills=skills;
		this.experience=experience;
		this.salary=salary;

	}

	void displaySoftwareEngineer()
	{
		System.out.println("***********Software Engineer***********");
		System.out.println("Role :"+this.role);
		System.out.println("Skills :"+this.skills);
		System.out.println("Experience :"+this.experience);
		System.out.println("Salary :"+this.salary);
	}


}

class SoftwareDeveloper extends SoftwareEngineer
{
	String role1;
	String skills1;
	double experience1;
	double salary1;
	String post1;

	SoftwareDeveloper(String role1, String skills1, double experience1, double salary1, String post1,String role, String skills, double experience, double salary)
	{
		super(role, skills,experience,salary);
		this.role1=role1;
		this.skills1=skills1;
		this.experience1=experience1;
		this.salary1=salary1;
		this.post1=post1;
	}

	void displaySoftwareDeveloper()
	{
		System.out.println("********Software Developer*********");
		System.out.println("Role :"+this.role1);
		System.out.println("Skills :"+this.skills1);
		System.out.println("Experience :"+this.experience1);
		System.out.println("Salary :"+this.salary1);
		System.out.println("Post :"+this.post1);
	}


}
class SoftwareTester extends SoftwareEngineer
{

	String role2;
	String skills2;
	double experience2;
	double salary2;
	String post2;

	SoftwareTester(String role2, String skills2, double experience2, double salary2, String post2,String role, String skills, double experience, double salary)
	{
		super(role, skills,experience,salary);
		this.role2=role2;
		this.skills2=skills2;
		this.experience2=experience2;
		this.salary2=salary2;
		this.post2=post2;
	}

	void displaySoftwareTester()
	{
		System.out.println("********Software Tester*********");
		System.out.println("Role :"+this.role2);
		System.out.println("Skills :"+this.skills2);
		System.out.println("Experience :"+this.experience2);
		System.out.println("Salary :"+this.salary2);
		System.out.println("Post :"+this.post2);
	}



}
class Hierarchical_Inheritance_Driver
{
	public static void main(String[] args) {
		 SoftwareDeveloper obj1=new SoftwareDeveloper("Software Developer", "Java", 2, 1000000, "Senior Developer","Software Engineer", "Java", 2, 1000000);

		 SoftwareTester obj2=new SoftwareTester("Software Tester", "Java", 2, 1000000, "Senior Tester","Software Engineer", "Java", 2, 1000000);

		 obj1. displaySoftwareEngineer();

		 obj1.displaySoftwareDeveloper();
		 obj2.displaySoftwareTester();
	}
}