class PrintArrayUsingDoWhile
{
	public static void main(String[] args) {
		char [] arr={'a','b','c','d','e'};
		int i=0;
		do 
		{
			System.out.print(arr[i++]+" ");
		}
		while(i<arr.length);
		
		
	}
}