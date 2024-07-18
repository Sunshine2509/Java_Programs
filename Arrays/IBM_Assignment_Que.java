class IBM_Assignment_Que
{
	public static void main(String[] args) {
		String arr[]={"36 36 30","47 8 60","86 86 86","45 56 50"};
		for(String i:arr)
		{
			String [] arr1=i.split(" ");
			System.out.println(i);

			if((arr1[0].equals(arr1[1]))&&(arr1[1].equals (arr1[2])))
			{
				System.out.println("Equilateral");
			}
			else if((arr1[0].equals(arr1[1]))||(arr1[1].equals (arr1[2])))
			{
				System.out.println("Isoscalas");
			}
			else 
			{
				System.out.println("None of these");
			}
			
		}

	}
}