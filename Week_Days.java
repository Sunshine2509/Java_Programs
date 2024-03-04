// Java program to print days in a week using switch statement.

// Prevention of fall through using break keyword.

class Week_Days
{
	public static void main(String args[])
	{
		int dayNum=5;

		switch(dayNum)
		{
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default: System.out.println(" Invalid Day Number.");
		}
	}
}

	/* Output: 

	Compile Time: Success 

	Runtime : Success and Friday */