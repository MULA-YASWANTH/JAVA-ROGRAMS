/*Write a java program to convert the given decimal number to binary.
Sample Input:
7
Sample Output:
111*/

// Java program to convert a decimal
// number to binary number
import java.util.Scanner;

class DTB
{
	// function to convert decimal to binary
	static void decToBinary(int n)
	{
		// array to store binary number
		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (n > 0)
		{
			// storing remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
	
	// driver program
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Decimal - " + n);
		System.out.print("Binary - ");
		decToBinary(n);
	}
}