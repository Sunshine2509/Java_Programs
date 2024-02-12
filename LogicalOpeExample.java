class LogicalOpeExample

{
	// Main Method

	public static void main(String[] args)

	{

	// Logical Operators
	// In logical operators the logical AND (&&) has first presidance.

	System.out.println(true&&true||true&&true||true&&false);

	System.out.println(false&&false||true&&true||true&&false);

	System.out.println(true&&false||true&&false||true&&true);

	System.out.println(false&&false||false&&false||true&&false);

	}

}