import.java.util.Scanner;
class FruitStore{
	int arr[];
	static Scanner sc=new Scanner(System.in);
	public void storeElement(arr[])
	{
		this.arr=arr;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

	}
	public void displayElement()
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter size");
		int size=sc.nextInt();

		System.out.println("Enter elements");
		int arr[]=new int[size];

		FruitStore f=new FruitStore();
		f.storeElement(arr);
		f.displayElement()
		
	}



}