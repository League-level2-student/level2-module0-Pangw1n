package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"hello", "test", "World", "array", "debug"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "new";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		//6. make an array of 50 integers
		int[] intArray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++)
		{
			intArray[i] = new Random().nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = intArray[0];
		for(int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] < smallestNumber)
			{
				smallestNumber = intArray[i];
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		//10. print the largest number in the array.
		int largestNumber = intArray[0];
		for(int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] > largestNumber)
			{
				largestNumber = intArray[i];
			}
		}
		System.out.println(largestNumber);
	}
}
