class ArrayLengthVariable2
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		int lenth=0;
		for(int i: arr)
		{
			lenth++;
			System.out.println(lenth);
		}
		System.out.println(lenth);
	}
}