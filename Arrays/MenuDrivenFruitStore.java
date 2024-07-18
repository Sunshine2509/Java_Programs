import java.util.*;
class MenuDrivenFruitStore
{
	String fruits[];
	static Scanner sc=new Scanner(System.in);
	public void storeFruits(String fruits[])
	{
		this.fruits=fruits;
		for (int i=0;i<fruits.length ;i++ ) {
			fruits[i]=sc.next();
			
		}
	}
	public void displayFruits()
	{
		System.out.println(Arrays.toString(fruits));
	}
	public void changeFruit()
	{
		System.out.println("Enter the fruit:");
		String inputFruit=sc.next();
		for(int i=0;i<fruits.length;i++)
		{
			if(inputFruit.equals(fruits[i]))
			{
				System.out.println("Enter fruit to update:");
				String updateFruit=sc.next();
				fruits[i]=updateFruit;
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter size");
		int size=sc.nextInt();

		System.out.println("Enter elements");
		String fruits[]=new String[size];
		MenuDrivenFruitStore m=new MenuDrivenFruitStore();
		 m.storeFruits(fruits);
		 m.displayFruits();
		 m.changeFruit();	

		// boolean exit=true;
		// while(exit)
		// {
		// 	System.out.println();
		// }	
	}

}