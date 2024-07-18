class Print_Array_3D
{
	public static void main(String[] args) {
		// array1 using for each
		int arr[][][]={{{10,20},{30},{40,50,60}}};

		for(int i[][]:arr)
		{
			for(int j[]:i)
			{
				for(int k:j)
				{
					System.out.print(k+" ");
				}
			}
		}


		// array using for loop
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
					
					System.out.print(arr[i][j][k]+" ");
			}
			}
		}
		}
	
