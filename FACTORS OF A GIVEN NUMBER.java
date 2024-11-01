/*Write a Java program to print the factors of a given number.
Sample Input:
144
Sample Output:
1 2 3 4 6 8 9 12 16 18 24 36 48 72 144*/

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.print(i+" ");
        }
    }
}