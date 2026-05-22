//Q15. Write a  program to reverse an array.

import java.util.*;

class Java15
{
    public static void main(String args[])
    {
        int[] a = new int[5];
Scanner sc = new Scanner(System.in);

  System.out.println("Enter array elements:");
 for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
System.out.println("Original Array:");

for(int i=0; i<5; i++)

        {
            System.out.print(a[i] + "\t");
        }

        System.out.println("\nReversed Array:");

        for(int i=4; i>=0; i--)
        {
            System.out.print(a[i] + "\t");
        }

       
    }
}