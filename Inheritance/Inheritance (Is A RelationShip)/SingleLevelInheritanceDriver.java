class Company
{
	String name;
	String type;
	String location;
	int establishedYear;
	int noOfEmployees;

	Company (String name,String type, String location, int establishedYear, int noOfEmployees)
	{
		super();
		this.name=name;
		this.type=type;
		this.location=location;
		this.establishedYear=establishedYear;
		this.noOfEmployees=noOfEmployees;
	}

	void displayCompany()
	{
		System.out.println("********Company Details*********");
		System.out.println("Name :"+this.name);
		System.out.println("Type :"+this.type);
		System.out.println("Location :"+this.location);
		System.out.println("Established Year :"+this.establishedYear);
		System.out.println("Number of employees :"+this.noOfEmployees);
	}
}

class ITCompany extends Company
{
	int noOfRoles;
	String requiredSkillType;
	double avgIncome;
	int noOfProjects;

	ITCompany(int noOfRoles, String requiredSkillType, double avgIncome, int noOfProjects, String name,String type, String location, int establishedYear, int noOfEmployees)
	{
		super(name, type, location, establishedYear, noOfEmployees);
		this.noOfRoles=noOfRoles;
		this.requiredSkillType=requiredSkillType;
		this.avgIncome=avgIncome;
		this.noOfProjects=noOfProjects;
	}

	void displayITCompany()
	{
		System.out.println("********IT Company Details");
		System.out.println("Number of Roles :"+this.noOfRoles);
		System.out.println("Required Skill Type :"+this.requiredSkillType);
		System.out.println("Average  Income :"+this.avgIncome +"crore per annum");
		System.out.println("Number of noOfProjects :"+noOfProjects);
	}


}

class SingleLevelInheritanceDriver
{
	public static void main(String[] args) {
		ITCompany it=new ITCompany(100,"Technical and communication",99999,100,"TCS","IT","Pune",1999,10000);
		it.displayCompany();
		it.displayITCompany();
	}
}