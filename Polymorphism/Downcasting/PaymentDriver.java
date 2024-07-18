import java.util.Scanner;

class payment
{
	public void findPayment (payment obj)
	{
		if(obj instanceof GooglePay)
		{
			GooglePay obj1=(GooglePay)obj;
			System.out.println(obj1.str);
		}
		else if(obj instanceof PhonePay) {
			PhonePay obj1=(PhonePay)obj;
			System.out.println(obj1.str);
		}
		else {
			AmezonPay obj1=(AmezonPay)obj;
			System.out.println(obj1.str);
		}
	}
}
class GooglePay extends payment
{
	String str="GooglePay";
}
class PhonePay extends payment
{
	String str="PhonePay";
}
class AmezonPay extends payment
{
	String str="AmezonPay";
}

class Flipkart 
{
	public void payment()
	{
		System.out.println("1.GooglePay");
		System.out.println("2.PhonePay");
		System.out.println("3.AmezonPay");
		System.out.println("4.Cash on Delivery");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter an  option ;");
		int opt=sc.nextInt();
		payment obj=null;

		switch(opt)
		{
		case 1:{
			obj=new GooglePay();        // upcasting
			obj.findPayment(obj);
			break;
		}
	case 2 :{
		obj=new PhonePay();        // upcasting
			obj.findPayment(obj);
			break;
		}
	case 3 : {
		obj=new AmezonPay();        // upcasting
			obj.findPayment(obj);
			break;
	}
case 4 : {
	System.out.println("Keep Your Cash Ready !!");
	break;
}
default : {
	System.out.println("Invalid option ");
	}
}
}
}


class PaymentDriver
{
	public static void main(String[] args) {
		Flipkart obj=new Flipkart();
		obj.payment();
	}
}