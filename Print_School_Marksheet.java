// Small Project/JAVA Program to create a school Repord Card
	class Print_School_Marksheet

{
	// This is the main method

	public static void main(String args[])

{	
	// Declaration and initialization of the variable 

	String Sch_Name="Bramha Education Valley",
	Affilliation="Maharashtra Board",
	Name="Pratiksha Patil",
	Date="21/02/2024",
	Roll_No="05",
	Sec="A",
	Exam="HSC";
	int M1=80,M2=90,M3=70,M4=90,M5=85;

	// Calculate Total of the marks

	int Sum=M1+M2+M3+M4+M5;

	// Calculate percentage 

	double p=(Sum*100)/500;

	// Calculate Grade using Ternary operator

	String Grade= (p<=100&&p>=90)?("A"):((p<90&&p>=75)?("B"):(p<75&&p>=55)?("C"):(p<55&&p>=35)?("D"):(p<35&&p>=0)?("Fail"):("Enter Valid Marks"));
	System.out.println();
	System.out.println();
	
	// Calculate remark

	String Remark=(Grade=="A")?("Excellent"):((Grade=="B")?("Very Good"):(Grade=="C")?("Good"):(Grade=="D")?("Poor"):(Grade=="Fail")?("You can do better"):("Enter Valid Grade"));

	// Printing the output

	System.out.println("				"+Sch_Name);
	System.out.println();
	System.out.println("			 	    "+Affilliation );
	System.out.println();

	System.out.println("	Name :"+Name+" 								Date:"+Date);
	System.out.println();
	System.out.println("	Roll No :"+Roll_No+" 			Sec:"+Sec+"						Exam:"+Exam);
	
	System.out.println();
	
	System.out.println("	Subject "+"			Total Marks		   "+"  Obtained Marks");
	System.out.println();
	System.out.println("	English"+"			      	 100			   	"+M1);
	System.out.println();  
	System.out.println("	Marathi"+"			     	 100			  	"+M2);
	System.out.println();
	System.out.println("	Physics"+"			      	 100			   	"+M3);
	System.out.println();
	System.out.println("	Mathematics"+"		     	 100			   	"+M4);
	System.out.println();
	System.out.println("	Computer Science"+"		 100			   	"+M5);
	System.out.println();
	System.out.println("	Total : "+"			 500			     	"+ Sum);
	System.out.println();
	System.out.println("	Percentage : "+p+"					     Grade :"+Grade);
	System.out.println();
	System.out.println("	Remark : "+Remark+"					     Signature :Pratiksha");

	
}
}
