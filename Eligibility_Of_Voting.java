/* Que 1) write a java programm to  check if a person is eligible  for  voting or not?
    condition
     1:he shuld be 18+;
    2:CITIZEN OF INDIA(CHECK WITH CHAR INPUT 'Y' FOR YES 'N' FOR NO); */

class Eligibility_Of_Voting
{
	public static void main(String args[])
	{
		int age=18;
		char Indian='Y';
		if(age>=18&&Indian=='Y')
		{
			System.out.println("You are eligible for voting");
		}	
		else
		{
			System.out.println("Sorry, not eligible for voting");
		}
	}
}

	

	/* Output: 

	Compile Time: Success 
	Runtime     : Success and You are eligible for voting */