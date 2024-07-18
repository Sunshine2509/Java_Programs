class University
{
	// non static variable

	String name;
	int universityCode;
	int noOfColleges;
	String type;
	int establishedYear;
	int noOfCourses;

	// declaring the variable of college class(class is a non primitive datatype.)

	College college1;

	//parameterized Constructor of university class

	University(String name, int universityCode,int noOfColleges,String type, int establishedYear, int noOfCourses)
	{
		this.name=name;
		this.universityCode=universityCode;
		this.noOfColleges=noOfColleges;
		this.type=type;
		this.establishedYear=establishedYear;
		this.noOfCourses=noOfCourses;
	}

	// user defined method to display the University details

	public void displayUniversity()
	{
		System.out.println("*********University Details************");
		System.out.println();
		System.out.println("University Name :"+name);
		System.out.println("University Code :"+universityCode);
		System.out.println("Number of colleges :"+noOfColleges);
		System.out.println("Established Year :"+ establishedYear);
		System.out.println("Number of Courses :"+noOfCourses);
	}

	// Creating method to create a instance of college class 

	public void createInstanceOfCollege(String name, int collegeCode,String address, String grade, int noOfDepartment,int staffCount)
	{
		college1=new College(name, collegeCode,address, grade, noOfDepartment,staffCount);
	}

}