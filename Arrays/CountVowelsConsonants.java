import java.util.*;
class CountVowelsConsonants
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		 char arr[]=new char [size];
		 System.out.println("Enter the elements:");
		 for(int i=0;i<size;i++)
		 {
		 	arr[i]=sc.next().charAt(0);
		 }

		 int vCount=0;
		 int cCount=0;
		 for(int i=0;i<size;i++)
		 {
		 	
		 	if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
		 	{
		 		vCount++;
		 	}
		 	else if (arr[i]>='A'&& arr[i]<='Z' || arr[i]>='a'&& arr[i]<='z')
		 	{
		 		cCount++;
		 	}
		 	
		 	
		 }
		 System.out.println("Vowels Count:"+vCount);
		 System.out.println("Consonants Count:"+cCount);
	}
}