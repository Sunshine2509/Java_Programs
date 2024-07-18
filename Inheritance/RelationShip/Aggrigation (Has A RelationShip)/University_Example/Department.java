class Department
{
	// non static variables

	String name;
	String hodName;
	int classrooms;
	int staffMembers;
	int noOfSubjects;

	// declaring the variable of Teacher class

	Teacher teacher1;

	//parameterized Constructor of Department class

	Department(String name, String hodName,int classrooms,int staffMembers, int noOfSubjects)
	{
		this.name=name;
		this.hodName=hodName;
		this.classrooms=classrooms;
		this.staffMembers=staffMembers;
		this.noOfSubjects=noOfSubjects;
	}

	// user defined method to display the Department details

	public void displayDepartment()
	{
		System.out.println("*********Department Details************");
		System.out.println();
		System.out.println("Department Name :"+name);
		System.out.println("Department Head :"+hodName);
		System.out.println("Number of classrooms :"+classrooms);
		System.out.println("Number of staff members :"+ staffMembers);
		System.out.println("Number of subjects :"+noOfSubjects);
	}

	// Creating method to create a instance of Teacher class 


	public void createInstanceOfTeacher(String name, String subject,int phoneNumber,String qualification, int experience)
	
	{
		teacher1=new Teacher(name, subject,phoneNumber, qualification, experience);
	}
	
}