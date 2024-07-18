
/* Encapsulation : Encapsulation is the process of binding or wrapping the data members(variables) and 
				   member function (methods) together representing as a single unit .  

				   OR 

				   It is the process of binding or wrapping attributes and behaviour of an object together 
				   is known as encapsulation.

				    */


class MyInfo
{
	// Make the variable private to restrict the direct access. (Data hiding process)

	private String name, nativePlace, branch;

	// Parameterized constructor of MyInfo class 

	MyInfo(String name, String nativePlace,String branch)
	{
		this.name=name;
		this.nativePlace=nativePlace;
		this.branch=branch;
	}

	// Setter method to set or update the name

	public void setName(String updateName)
	{
		this.name=updateName;
		System.out.println("Name updated successfully");
		
	}

	// getter method to get or access the name

	public String getName()
	{
		return name;

	}

	// Setter method to set or update the  native place

	public void setNativePlace(String upadateNativePlace)
	{
		nativePlace=upadateNativePlace;
		System.out.println("Native Place updated successfully");
	}

	// getter method to get or access the  native place

	public String getNativePlace()
	{
		return nativePlace;

	}

	// Setter method to set or update the branch

	public void setBranch(String updateBranch)
	{
		branch=updateBranch;
		System.out.println("Branch updated successfully.");
	}
	

	// getter method to get or access the branch

	public String getBranch()
	{
		return branch;

	}

}


class Encapsulation_Example
{
	public static void main(String[] args) {

		// creating object to access non static variables in static context

		MyInfo obj=new MyInfo("Pratiksha", "Buldana", "mca");

		// calling methods

		obj.setName("Pratiksha");
		System.out.println(obj.getName());
		System.out.println(obj.getNativePlace());
		System.out.println(obj.getBranch());


		
	}
}

/* Output  : 
Name updated successfully
Pratiksha
Buldana
mca   */