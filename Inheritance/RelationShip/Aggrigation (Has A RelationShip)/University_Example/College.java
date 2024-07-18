class College
{
	// non static variables

	String name;
	int collegeCode;
	String  address;
	String grade;
	int noOfDepartment;
	int staffCount;

	// declaring the variable of Department class

	Department department1;

	//parameterized Constructor of College class

	College(String name, int collegeCode,String address, String grade, int noOfDepartment,int staffCount )
	{
		this.name=name;
		this.collegeCode=collegeCode;
		this.address=address;
		this.grade=grade;
		this.noOfDepartment=noOfDepartment;
		this.staffCount=staffCount;
	}

	// user defined method to display the college details

	public void displayCollege()
	{
		System.out.println("*********College Details************");
		System.out.println();
		System.out.println("College Name :"+name);
		System.out.println("College Code : "+collegeCode);
		System.out.println("Address of college :"+address);
		System.out.println("Grade of College :"+ grade);
		System.out.println("Number of department :"+noOfDepartment);
		System.out.println("Number of Staff members :"+staffCount);
	}

	// Creating method to create a instance of Department class 


	public void createInstanceOfDepartment(String name, String hodName,int classrooms, int staffMembers, int noOfSubjects)
	{
		department1=new Department(name, hodName,classrooms, staffMembers, noOfSubjects);
	}


}