class Nested_Switch_Case
{
	//Main method

	public static void main(String args[])
	{
		//Declaration and initialization of variable (keys)

		int Item=2;
		char flower='d';
		char fruit='a';
		char food='i';
		
		//Nested switch

		switch(Item)
		{
			case 1: switch(fruit)
			{
				case 'a': System.out.println("Mango");
				break;
				case 'b': System.out.println("Apple");
				break;
				case 'c': System.out.println("Banana");
				break;
				default: System.out.println(" Invalid char value");
			}
			break;
			case 2: switch(flower)
			{
				case 'd': System.out.println("Rose");
				break;
				case 'e': System.out.println("Lotus");
				break;
				case 'f': System.out.println("Lily");
				break;
				default: System.out.println(" Invalid char value");
			}
			break;
			case 3: switch(food)
			{
				case 'g': System.out.println("Panipuri");
				break;
				case 'h': System.out.println("Gulab Jamun");
				break;
				case 'i': System.out.println("Icecream");
				break;
				default: System.out.println(" Invalid char value");
			}
			break;
			default: System.out.println("Invalid case value");
		}
	}
}

		/* Output: 

		Compile Time: Success
		Runtime : Success and Rose */