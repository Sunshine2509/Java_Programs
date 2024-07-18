import java.util.Scanner;
class StringToArray1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String sen=sc.nextLine();
		String word=" ";
		for(int i=0;i<sen.length();i++)
		{
			char ch=sen.charAt(i);
			if(ch==' ')
			{
				System.out.println(i);
				break;
			}
			word+=ch;
		}
		System.out.println(word);
		}
	}
