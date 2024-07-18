import java.util.*;
class OddArray
{
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8};
		// find the count
		int count=0;
		for(int i:arr)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		int []oddNumbers=new int [count];
		// index var to store element in oddNumbers array

		int index=0;
		// find odd and store in new array

		for(int i:arr)
		{
			// check if element is odd and store it by incrmenting the index by 1

			if(i%2!=0)
			{
				oddNumbers[index++]=i;
			}
		}
		System.out.println(Arrays.toString(oddNumbers));
	
	}
}