class Company
{
	// non static variable

	String name;
	String location;
	String type;
	int establishedYear;
	int noOfEmployees;
	
	// declaring the variable of Department class
	
	Department dep1;

	//parameterized Constructor of Company class

	Company(String name, String location ,String type,int establishedYear, int noOfEmployees)
	{
		this.name=name;
		this.location=location;
		this.type=type;
		this.establishedYear=establishedYear;
		this.noOfEmployees=noOfEmployees;
		
	}

	// user defined method to display the Company details

	public void displayCompany()
	{
		System.out.println("*********COMPANY Details************");
		System.out.println();
		System.out.println("Company name :"+name);
		System.out.println("Company location :"+location);
		System.out.println("Type :"+type);
		System.out.println("Established Year :"+ establishedYear);
		System.out.println("Number of Employees :"+noOfEmployees);
	}

	// Creating method to create a instance of Department class

	public void createInstanceOfDepartment(String name,String headOfDepartment, String function, int noOfEmployees,String performance )
	{
		dep1=new Department (name,headOfDepartment,function, noOfEmployees, performance);
	}
}

class Department
{
	// non static variable

	String name;
	String headOfDepartment;
	String function;
	int noOfEmployees;
	String performance;
	
	// declaring the variable of Manager class
	
	Manager manager1;

	//parameterized Constructor of Department class

	Department(String name, String headOfDepartment ,String function,int noOfEmployees, String performance)
	{
		this.name=name;
		this.headOfDepartment=headOfDepartment;
		this.function=function;
		this.noOfEmployees=noOfEmployees;
		this.performance=performance;
		
	}

	// user defined method to display the Department details

	public void displayDepartment()
	{
		System.out.println("*********Department Details************");
		System.out.println();
		System.out.println("Name :"+name);
		System.out.println("Head of department :"+headOfDepartment);
		System.out.println("Function of department :"+function);
		System.out.println("Number of employees :"+ noOfEmployees);
		System.out.println("Performance :"+performance);
	}

	// Creating method to create a instance of Manager class 

	public void createInstanceOfManager(String name, String qualification, String responsibility, String role, int noOfEmployees)
	{
		manager1=new Manager(name, qualification,responsibility,role,noOfEmployees);
	}
	
}
class Manager
{
	// non static variable

	String name;
	String qualification;
	String responsibility;
	String role;
	int noOfEmployees;
	

	// declaring the variable of TeamLeader class
	
	TeamLeader temleader1;

	//parameterized Constructor of Manager class

	Manager(String name,String qualification,String responsibility,String role, int noOfEmployees)
	{
		this.name=name;
		this.qualification= qualification;
		this.responsibility=responsibility;
		this.role=role;
		this.noOfEmployees=noOfEmployees;
		
	}

	// user defined method to display the Manager Details

	public void displayManager()
	{
		System.out.println("*********Manager's Details********");
		System.out.println();
		System.out.println("name :"+name);
		System.out.println("Qualification :"+qualification);
		System.out.println("Responsibility :"+responsibility);
		System.out.println("Role :"+ role);
		System.out.println("Number of Employees :" +noOfEmployees);
	}

	// Creating method to create a instance of Team Leader class 

	public void createInstanceOfTeamLeader(String name, String role, String qualification , int noOfTeamMembers,int experience)
	{
		temleader1=new TeamLeader(name, role, qualification, noOfTeamMembers,experience);
	}
}

class TeamLeader
{
	// non static variable

	String name;
	String role;
	String qualification;
	int noOfTeamMembers;
	int experience;
	
	// declaring the variable of Employee class
	
	Employee employee1;

	//parameterized Constructor of Company class

	TeamLeader(String name, String role, String qualification, int noOfTeamMembers, int experience)
	{
		this.name=name;
		this.role=role;
		this.qualification=qualification;
		this.noOfTeamMembers=noOfTeamMembers;
		this.experience=experience;
		
	}

	// user defined method to display the Team Leader details

	public void displayTeamLeader()
	{
		System.out.println("*********Team Leader Details************");
		System.out.println();
		System.out.println("Team Leader name :"+name);
		System.out.println("Role  :"+role);
		System.out.println("Qualification :"+qualification);
		System.out.println("Number of team members :"+ noOfTeamMembers);
		System.out.println("Experience :"+experience);
	}

	// Creating method to create a instance of Employee class

	public void createInstanceOfEmployee(String name, int id , String qualification, String role, double salary)
	{
		employee1=new Employee (name, id, qualification, role, salary);
	}
}

class Employee
{
	// non static variable

	String name;
	int id;
	String qualification;
	String role;
	double salary;
	
	

	//parameterized Constructor of Employee class

	Employee(String name, int id, String qualification, String role , double salary)
	{
		this.name=name;
		this.id=id;
		this.qualification=qualification;
		this.role=role;
		this.salary=salary;
		
	}

	// user defined method to display the Employee details

	public void displayEmployee()
	{
		System.out.println("*********Employee Details************");
		System.out.println();
		System.out.println("Employee name :"+name);
		System.out.println("Employee id :"+id);
		System.out.println("Qualification :"+qualification);
		System.out.println("Role  :"+ role);
		System.out.println("Salary :"+salary);
	}

}


class CompanyDriver
{
	public static void main(String[] args) {
		 
		 Company obj=new Company ("TCS", "Pune","IT",1765,4444);
		 obj.displayCompany();
		 obj.createInstanceOfDepartment("Development", "Pratiksha Patil","Develope the software applications",333,"Better");
		 obj.dep1.displayDepartment();
		 obj.dep1.createInstanceOfManager("ABC","MTECH","Mangement of team","Project Manager",45);
		 obj.dep1.manager1.displayManager();
		 obj.dep1.manager1.createInstanceOfTeamLeader("ABC","Lead the team","ME",38,4);
		 obj.dep1.manager1.temleader1.displayTeamLeader();
		 obj.dep1.manager1.temleader1.createInstanceOfEmployee("Pratiksha",3,"MCA","Software Developer",10000000);
		 obj.dep1.manager1.temleader1.employee1.displayEmployee();
	}
}






