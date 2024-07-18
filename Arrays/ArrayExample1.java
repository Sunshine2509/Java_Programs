import java.util.*;
class ArrayExample1
{
	public static void main(String[] args) {
		// array 1

		int [][][] arr1=new int [2][2][2];
		arr1[0][0][0]=10;
		arr1[0][0][1]=20;
		arr1[0][1][0]=30;
		arr1[0][1][1]=40;
		arr1[1][0][0]=50;
		arr1[1][0][1]=60;
		arr1[1][1][0]=70;
		arr1[1][1][1]=80;
		System.out.println(Arrays.deepToString(arr1));
		

		// array 2

		int [][][] arr2=new int [2][2][];
		arr2[0][0]=new int[1];
		arr2[0][1]=new int[2];
		arr2[1][0]=new int[1];
		arr2[1][1]=new int[3];

		arr2[0][0][0]=10;
		arr2[0][1][0]=20;
		arr2[0][1][1]=30;
		arr2[1][0][0]=40;
		arr2[1][1][0]=50;
		arr2[1][1][1]=60;
		arr2[1][1][2]=70;
		


		System.out.println(Arrays.deepToString(arr2));

		// array 3

		int [][][] arr3=new int [2][][];

		arr3[0]=new int [3][1];
		arr3[1]=new int [2][];
		arr3[1][0]=new int [2];
		arr3[1][1]=new int [3];

		arr3[0][0][0]=10;
		arr3[0][1][0]=20;
		arr3[0][2][0]=30;
		arr3[1][0][0]=40;
		arr3[1][0][1]=50;
		arr3[1][1][0]=60;
		arr3[1][1][1]=70;
		arr3[1][1][2]=80;
		
		System.out.println(Arrays.deepToString(arr3));

		// array 4
		
		int [][][] arr4=new int [3][][];

		arr4[0]=new int [1][2];
		arr4[1]=new int [2][2];
		arr4[2]=new int [3][2];
		arr4[0][0][0]=10;
		arr4[0][0][1]=20;
		arr4[1][0][0]=30;
		arr4[1][0][1]=40;
		arr4[1][1][0]=50;
		arr4[1][1][1]=60;
		arr4[2][0][0]=70;
		arr4[2][0][1]=80;
		arr4[2][1][0]=90;
		arr4[2][1][1]=100;
		arr4[2][2][0]=120;
		arr4[2][2][1]=130;


		
		
		System.out.println(Arrays.deepToString(arr4));

		// array 5

		int [][][][] arr5=new int [2][][][];

		arr5[0]=new int [2][1][1];
		arr5[1]=new int [3][][];
		arr5[1][0]=new int [1][1];
		arr5[1][1]=new int [2][1];
		arr5[1][2]=new int [3][1];

		arr5[0][0][0][0]=1;
		arr5[0][1][0][0]=2;
		arr5[1][0][0][0]=3;
		arr5[1][1][0][0]=4;
		arr5[1][1][1][0]=5;
		arr5[1][2][0][0]=6;
		arr5[1][2][1][0]=7;
		arr5[1][2][2][0]=8;
		
		System.out.println(Arrays.deepToString(arr5));

		// array 6
		
		int [][] arr6=new int [2][3];
		arr6[0][0]=10;
		arr6[0][1]=20;
		arr6[0][2]=30;
		arr6[1][0]=40;
		arr6[1][1]=50;
		arr6[1][2]=60;
		
		
		System.out.println(Arrays.deepToString(arr6));

		// array 7
		
		int [][] arr7=new int [3][];

		arr7[0]=new int [2];
		arr7[1]=new int [1];
		arr7[2]=new int [2];

		arr7[0][0]=10;
		arr7[0][1]=20;
		arr7[1][0]=30;
		arr7[2][0]=40;
		arr7[2][1]=50;

		
		
		System.out.println(Arrays.deepToString(arr7));


	}
}