/* Java Program of Aggrigation association(Relationship) between University , college, department and teacher 

			(Unidirectional Relationship) (Has A RelationShip) 

			1) This program includes University.java , College.java , Department.java and Teacher.java which shows

			    One way Relationship between them. */

class UniversityDriver
{

	// main method

	public static void main(String[] args) {

		// Instance of University class

		University obj=new University("SGBAU",1234,1100,"Government",1950,300);

		// Calling method to get the university details using object 

		obj.displayUniversity();

		// calling method to create a instance of college class which is declare in university class

		obj.createInstanceOfCollege("SCS",322,"Shegaon","A++",3,50);

		// Calling method to get the college details using object 

		obj.college1.displayCollege();

		// calling method to create a instance of Department class which is declare in College class

		obj.college1.createInstanceOfDepartment("Computer Science","P.Chaudhari",5,50,30);

		// Calling method to get the department details using object 

		obj.college1.department1.displayDepartment();

		// calling method to create a instance of Teacher class which is declare in Department class

		obj.college1.department1.createInstanceOfTeacher("Shrikant","JAVA",1234567890,"MTech",2);

		// Calling method to get the Teacher details using object 

		obj.college1.department1.teacher1.displayTeacher();
		}
}