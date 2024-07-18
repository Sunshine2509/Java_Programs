class India
{
	String leader;
	String capital;
	double population;
	String language;

	India(String leader, String capital, double population, String language)
	{
		super();
		this.leader=leader;
		this.capital=capital;
		this.population=population;
		this.language=language;
	}

	void displayIndia()
	{
		System.out.println("*********Details of India********");
		System.out.println("Leader :"+ this.leader);
		System.out.println("Capital : "+ this.capital);
		System.out.println("Population :"+this.population +"Crore");
		System.out.println("Language :"+this.language);
	}

}

class Maharashtra extends India
{
	String  leader1;
	String capital1;
	double population1;
	String language1;

	Maharashtra(String leader1, String capital1, double population1, String language1,String leader, String capital, double population, String language)
	{
		super(leader,capital,population,language);
		this.leader1=leader1;
		this.capital1=capital1;
		this.population1=population1;
		this.language1=language1;
	}

	void displayMaharashtra()
	{
		System.out.println("*********Details of Maharashtra********");
		System.out.println("Leader :"+ this.leader1);
		System.out.println("Capital : "+ this.capital1);
		System.out.println("Population :"+this.population1+" crore ");
		System.out.println("Language :"+this.language1);
	}

}

class Gujrat extends India
{
	String  leader2;
	String capital2;
	double population2;
	String language2;

	Gujrat(String leader2, String capital2, double population2, String language2,String leader, String capital, double population, String language)
	{
		super(leader,capital,population,language);
		this.leader2=leader2;
		this.capital2=capital2;
		this.population2=population2;
		this.language2=language2;
	}

	void displayGujrat()
	{
		System.out.println("*********Details of Gujrat********");
		System.out.println("Leader :"+ this.leader2);
		System.out.println("Capital : "+ this.capital2);
		System.out.println("Population :"+this.population2+" crore ");
		System.out.println("Language :"+this.language2);
	}

}

class Rajasthan extends India
{
	String  leader3;
	String capital3;
	double population3;
	String language3;

	Rajasthan(String leader3, String capital3, double population3, String language3,String leader, String capital, double population, String language)
	{
		super(leader,capital,population,language);
		this.leader3=leader3;
		this.capital3=capital3;
		this.population3=population3;
		this.language3=language3;
	}

	void displayRajasthan()
	{
		System.out.println("*********Details of Rajasthan********");
		System.out.println("Leader :"+ this.leader3);
		System.out.println("Capital : "+ this.capital3);
		System.out.println("Population :"+this.population3+" crore ");
		System.out.println("Language :"+this.language3);
	}

}




class Hierarchical_Inheritance_Driver1
{
	public static void main(String[] args) {

		Maharashtra obj1=new Maharashtra ("Sanjay Gayakwad","Mumbai",12.55,"Marathi","Nerendra modi","Delhi",143,"Hindi");
		obj1.displayIndia();
		obj1.displayMaharashtra();

		Gujrat obj2=new Gujrat ("Bhupendra Patel","Gandhinagar",7.22,"Gujrati","Nerendra modi","Delhi",143,"Hindi");
		obj2.displayGujrat();

		Rajasthan obj3=new Rajasthan("Bhajan Lal Sharma","Jaipur",6.86,"Rajasthani","Nerendra modi","Delhi",143,"Hindi");
		obj3.displayRajasthan();
		
	}
}