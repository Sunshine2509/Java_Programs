class Human
{
	String name;
	String gender;

	Human( String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}

	void eat()
	{
		System.out.println("Human can eat");
	}

	void walk()
	{
		System.out.println("Human can walk");
	}

	void think()
	{
		System.out.println("Human can think");
	}

	void speak()
	{
		System.out.println("Human can speak");
	}

	void displyHuman()
	{
		System.out.println("*********Human Details************");
		System.out.println("Name:"+ this.name);
		System.out.println("Gender :"+this.gender);
	}
}

class Graduation extends Human
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;

	Graduation (String course, int duration , String branch, String university, int yop,String name,String gender)
	{
		super(name, gender);
		this.course=course;
		 this. duration=duration;
		 this.branch=branch;
		 this. university=university;
		 this.yop=yop;
	}

	void displayGraduation()
	{
		System.out.println("********Graduation Details**********");
		System.out.println("Course :"+ this.course);
		System.out.println("Duration :"+this.duration);
		System.out.println("Branch :"+this.branch);
		System.out.println("University :"+this.university);
		System.out.println("Year of Passout"+ this.yop);
	}
}

class PostGraduation extends Graduation
{
	String specializaton;
	int pgDuration;
	int pgYOP;
	String pgUniversity;

	PostGraduation(String specializaton, int pgDuration, int pgYOP, String pgUniversity,String course, int duration , String branch, String university, int yop,String name,String gender)
	{
		super( course,  duration ,  branch,  university,  yop, name, gender);
		this.specializaton=specializaton;
		this.pgDuration=pgDuration;
		this.pgYOP=pgYOP;
		this.pgUniversity=pgUniversity;
	}

	void displayPostGraduation()
	{
		System.out.println("*********Post Graduation Details*********");
		System.out.println("Specialization :"+this.specializaton);
		System.out.println("Duration :"+this.pgDuration);
		System.out.println("Year of Passout :"+this.pgYOP);
		System.out.println("University :"+this.pgUniversity);
	}
}

class Job extends PostGraduation
{
	String company;
	double salary;
	String designation;
	String location;

	Job( String company, double salary, String designation, String location,String specializaton, int pgDuration, int pgYOP, String pgUniversity,String course, int duration , String branch, String university, int yop,String name, String gender)
	{
		super(specializaton,pgDuration,pgYOP,pgUniversity, course,  duration ,  branch,  university,  yop,name, gender);
		this. company=company;
		this.salary=salary;
		this.designation=designation;
		this.location=location;
	}

	void displayJob()
	{
		System.out.println("*******Job Details********");
		System.out.println("Company :"+ this.company);
		System.out.println("Salary :"+this.salary+"lakhs");
		System.out.println("designation :"+designation);
		System.out.println("Location :"+ this.location);
	}
}

class Multilevel_Inheritance_Driver
{
	public static void main(String[] args) {
		Job obj=new Job("TCS", 7,"Ass. Software Engineeer","Pune","Cyber Security",2,2026,"SGBAU","Bachlor of Engineering",4,"CS","SGBAU",2024, "Ramesh" , "Male");
		obj.displayJob();
		obj.displayPostGraduation();
		obj.displayGraduation();
		obj.displyHuman();
		obj.eat();
		obj.walk();
		obj.think();
		obj.speak();
		
	}
}