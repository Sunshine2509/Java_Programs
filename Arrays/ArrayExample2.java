// creation of array by 2nd way

import java.util.*;

class ArrayExample2
{
	public static void main(String[] args) {
		
	
	byte [][][] arr1={{{10,20},{30,40,50}},{{60},{70,80,90,100}}};
	System.out.println(Arrays.deepToString(arr1));

	// array 2

	char [][] arr2={{'a','b'},{'c','d','e'},{'f','g'}};
	System.out.println(Arrays.deepToString(arr2));

	// array 3

	byte [][][] arr3={{{2,4},{8,6,10}},{{12},{14,16},{18}}};
	System.out.println(Arrays.deepToString(arr3));

	// array 4

	byte [][] arr4={{10,20,30},{40,50},{60,70,80}};
	System.out.println(Arrays.deepToString(arr4));




	}
}