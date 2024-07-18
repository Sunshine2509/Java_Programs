class ProgrammingLanguage
{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extension;

	ProgrammingLanguage(S)
	{
		super();
		this.type=type;
		this.level=level;
		this.inventedYear=inventedYear;
		this.founderName=founderName;
		this.latestVersion=latestVersion;
		this.extension=extension;
	}

	public void displayProgrammingLanguage()
	{
		System.out.println("********ProgrammingLanguage********");
		System.out.println("Type :"+type);
		System.out.println("Level :"+level);
		System.out.println("Invented Year :"+ inventedYear);
		System.out.println(" Founder Name :"+founderName);
		System.out.println("Latest Version :"+latestVersion);
		System.out.println("Extension :"extension);
	}
}

class JAVA extends ProgrammingLanguage
{
	String [] features;
	boolean platformIndependent;

	JAVA(String [] features,boolean platformIndependent)
	{
		super();
		this.features=features;
		this.platformIndependent=platformIndependent;
	}

	public void displayJava()
	{
		System.out.println("********JAVA**********");
		System.out.println("Features Of Java :"+Arrays.toString(this.features);
		System.out.println("Is it platform independent ? :"this.platformIndependent);
	}
}