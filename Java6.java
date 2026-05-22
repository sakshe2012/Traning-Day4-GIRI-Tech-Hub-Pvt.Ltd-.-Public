// Q6. Write a program to count total number of negative elements in an array.

import java.util.*;

class Java6
{
    public static void main(String args[])
    {
        int[] a = new int[5];

        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++)
        {
            if(a[i] < 0)
            {
                count++;
            }
        }

        System.out.println("Total negative elements: " + count);

    }
}