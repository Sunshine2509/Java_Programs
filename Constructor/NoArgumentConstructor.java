/* No argument constructor : 1)  A constructor without any formal argument is known as no argument constructor.

							 2)  Programmer can create a no argument constructor if we don't want to pass an input data. */


	class NoArgumentConstructor
	{
		// no argument constructor

		NoArgumentConstructor()
		{
			System.out.println("Hello from no argument constructor");
		}

		public static void main(String[] args) {
			
			// object

			NoArgumentConstructor obj=new NoArgumentConstructor();
		}

	}

	/* Output : 

	 Hello from no argument constructor  */