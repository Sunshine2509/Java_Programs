class Teacher
{
	// non static variables

	String name;
	String subject;
	int phoneNumber;
	String qualification;
	int experience;

	//parameterized Constructor of Teacher class

	Teacher(String name, String subject,int phoneNumber,String qualification, int experience)
	{
		this.name=name;
		this.subject=subject;
		this.phoneNumber=phoneNumber;
		this.qualification=qualification;
		this.experience=experience;
	}
	public void displayTeacher()
	{
		System.out.println("*********Teacher Details************");
		System.out.println();
		System.out.println("Teacher Name :"+name);
		System.out.println("Teacher's  subject :"+subject);
		System.out.println("Phone Number :"+phoneNumber);
		System.out.println("Qualification  :"+ qualification);
		System.out.println("Experience :"+experience +" Years");
	}
}