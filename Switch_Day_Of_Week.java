// Java program to print days in a week using switch statement.

// Prevention of fall through using lamda expression(->).

class Switch_Day_Of_Week
{
	public static void main(String args[])
	{
		int dayNum=5;
		switch(dayNum)
		{
		case 1 -> System.out.println("Monday");
		case 2 ->System.out.println("Tuesday");
		case 3 ->System.out.println("Wednesday");
		case 4 ->System.out.println("Thursday");
		case 5 ->System.out.println("Friday");
		case 6 ->System.out.println("Saturday");
		case 7 ->System.out.println("Sunday");
		default->System.out.println(" Invalid Day Number.");
		}
	}
}


	/* Output: 

	Compile Time: Success 

	Runtime : Success and Friday */