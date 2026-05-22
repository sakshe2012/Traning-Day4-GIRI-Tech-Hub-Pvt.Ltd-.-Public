// Q11. Write a  program to print all unique elements in an array.

import java.util.*;

class Java11
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

        System.out.println("Unique elements are:");

        for(int i=0; i<5; i++)
        {
            int count = 0;

            for(int j=0; j<5; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }

            if(count == 1)
            {
                System.out.print(a[i] + "\t");
            }
        }

      
    }
}