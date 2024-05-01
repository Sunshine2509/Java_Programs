/* Parameterized Constructor : 1) It is a constructor with formal arguments.
		
							   2)  Parameterized constructor can except an input data beacause it has formal arguments. */


	class ParameterizedConstructor
	{
		// main method

		public static void main(String[] args) {

			// object creating 

			Student obj1=new Student ("Pratiksha","MCA",1);
			obj1.displayStudentInfo();

			Student obj2=new Student ("Shubham","MSc",2);
			obj2.displayStudentInfo();

			
		}
	}

	class Student
	{

		// non static variables

		String name;
		String branch;
		int id;

		 // non static method

		 void displayStudentInfo()
		 {
		 	System.out.println("**********Student Information********");
		 	System.out.println("Student Name : "+ name);
		 	System.out.println("Branch : "+ branch);
		 	System.out.println("Student Id : "+ id);
		 }

		 // Parameterized constructor 

		 Student(String name, String branch, int id)
		 {
		 	// Storing value of current object using this keyword
		 	
		 	this.name=name;
		 	this.branch=branch;
		 	this.id=id;
		 }


	}


	/* Output : 

**********Student Information********
Student Name : Pratiksha
Branch : MCA
Student Id : 1
**********Student Information********
Student Name : Shubham
Branch : MSc
Student Id : 2     */