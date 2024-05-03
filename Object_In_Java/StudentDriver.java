
// Java Program for creating an object of Student class

class Student
{
	// Global variables

	int studentId;
	String studentName;
	String studentClass;
	String studentAddress;
	String studentBranch;
	String studentResult;

	// User defined method for displaying student information

	public void displayStudentInfo()
	{
		System.out.println("*********Student Information***********");
		System.out.println("Student Id : "+ studentId);
		System.out.println("Student Name : "+ studentName);
		System.out.println("Student Class : "+ studentClass);
		System.out.println("Student Address : "+ studentAddress);
		System.out.println("Student Branch : "+ studentBranch);
		System.out.println("Student Result : " + studentResult);

	}
}

// class which having main method()

class StudentDriver
{
	public static void main(String[] args) {
		
	
	// Creating the object of Student class

	Student obj= new Student();

	obj.studentId=1;
	obj.studentName="Pratiksha"	;
	obj.studentClass="MCA";
	obj.studentAddress="Buldana";
	obj.studentBranch="Computer Science";
	obj.studentResult="PASS";

	obj.displayStudentInfo();

	// Creating multiple object for storing multiple records

	Student obj1=new Student();

	obj1.studentId=3;
	obj1.studentName="Pratiksha"	;
	obj1.studentClass="MCA";
	obj1.studentAddress="Buldana";
	obj1.studentBranch="Computer Science";
	obj1.studentResult="PASS";

	obj1.displayStudentInfo();
}
}

/* Output : 

	Compile time : Success

	Runtime : 
				*********Student Information***********
				Student Id : 1
				Student Name : Pratiksha
				Student Class : MCA
				Student Address : Buldana
				Student Branch : Computer Science
				Student Result : PASS

				*********Student Information***********
				Student Id : 3
				Student Name : Pratiksha
				Student Class : MCA
				Student Address : Buldana
				Student Branch : Computer Science
				Student Result : PASS
 			*/