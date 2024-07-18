class Bank
{
	String accountHolderName;
	private int pwd;
	String branch;
	String address;
	private double balance;
	String ifsc;

	Bank(String accountHolderName, String branch, String address, String ifsc)
	{
		this.accountHolderName=accountHolderName;
		this.branch=branch;
		this.address=address;
		this.ifsc=ifsc;
	}

	public void printBankDetails()
	{
		System.out.println("********Bank Details********");
		System.out.println("Name :"+this.accountHolderName);
		System.out.println("Branch :"+this.branch);
		System.out.println("Address :"+this.address);
		System.out.println("IFSC :"+this.ifsc);


	}
	public void setPwd(int updatePwd)
	{
		this.pwd=updatePwd;
	}
	public void setBalance(double updateBalance)
	{
		this.balance=updateBalance;
	}

	public int getPwd()
	{
		return this.pwd;
	}
	public double getBalance()
	{
		return this.balance;
	}

}

class EncapsulationDriver1
{

	public static void main(String[] args) {
		Bank obj=new Bank("Pratiksha","Deccan","Pune","SBI1234567");
		obj.printBankDetails();
		obj.setPwd(123456);
		obj.setBalance(1000000.00);
		System.out.println(obj.getPwd());
		System.out.println(obj.getBalance());
	}

}