abstract class RBI
{
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositeLimit();
}

abstract class SBI extends RBI
{
	String accountType;
	String accountHolderName;

	SBI(String accountType, String accountHolderName)
	{
		super();
		this.accountType=accountType;
		this.accountHolderName=accountHolderName;
	}

	public void displayAccountDetails()
	{
		System.out.println("Name :"+this.accountHolderName);
		System.out.println("Account Type :"+this.accountType);
	}
}
class Saving extends SBI
{
	Saving(String accountType, String accountHolderName)
	{
	super(accountType , accountHolderName);
}

	public void rateOfInterest()
	{
		System.out.println("Rate of Interest  :"+ 8.5+"%");
		
		
	}
	public void withdrawLimit()
	{
		System.out.println("Withdraw Limit :"+50000+"Rs.");
	}
	public void depositeLimit()
	{
		System.out.println("Deposite Limit :"+100000+"RS.");
	}
}

class Current extends SBI
{
	Current(String accountType, String accountHolderName)
	{
	super(accountType , accountHolderName);
}
	public void rateOfInterest()
	{
		System.out.println("Rate of Interest  :"+ 7.5+"%");
				
	}
	public void withdrawLimit()
	{
		System.out.println("Withdraw Limit :"+500000+"Rs.");

	}
	public void depositeLimit()
	{
		System.out.println("Deposite Limit :"+1000000+"RS.");
	}
}

class Abstraction2
{
	public static void main(String[] args) {
		 Saving obj1=new Saving ("Saving","Pratiksha");
		 obj1.displayAccountDetails();
		 obj1.rateOfInterest();
		 obj1.withdrawLimit();
		 obj1.depositeLimit();

		 Current obj2=new Current("Current","Nikita");
		 obj2.displayAccountDetails();
		 obj2.rateOfInterest();
		 obj2.withdrawLimit();
		 obj2.depositeLimit();

	}
}
