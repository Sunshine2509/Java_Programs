import java.util.Scanner;
class SumAndProduct2D
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows :");
		int row=sc.nextInt();
		System.out.println("Enter the cols:");
		int col=sc.nextInt();

		int a[][]=new int [row][col];
		int sum=0;
		int product=1;
		System.out.println("Enter the elements");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{

				a[i][j]=sc.nextInt();
				sum=sum+a[i][j];
				product=product*a[i][j];
			}
		}
		System.out.println("Sum:"+sum);
		System.out.println("Product :"+product);

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}