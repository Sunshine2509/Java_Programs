import java.util.Scanner;
class SumAndProduct
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements:");
		int a[]=new int[size];
		int sum=0;
		int product=1;

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			product=product*a[i];
		}
		System.out.println("Sum:"+sum);
		System.out.println("Product:"+product);
	}
}