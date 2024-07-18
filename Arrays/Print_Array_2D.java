class Print_Array_2D
{
	public static void main(String[] args) {

		// array1 using for each loop

		int [][] arr1={{1,2,3},{4,5},{6,7,8,9}};

		for(int i[]:arr1)
		{
			for(int j:i)
			{
				System.out.println(j);
			}
		}

		// array1 using for  loop

		

		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
		}

		// array1 using while loop
		int i=0;
		while(i<arr[i].length)
		{
			int j=0;
			while(j<arr[i][j].length)
			{
				System.out.print(arr[i][j]);
				j++;
			}
			i++;
		}
		

		// array1 using

		int arr2[][][]={{{10,20},{30},{40,50,60}}};
		for(int i[][]:arr2)
		{
			for(int j[]:i)
			{
				for(int k:j)
				System.out.println(k);
			}
		}
	}
}