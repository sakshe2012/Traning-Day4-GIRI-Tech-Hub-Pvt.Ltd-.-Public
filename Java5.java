// Q5. Write a  program to count total number of even and odd elements in an array.


import java.util.*;

class Java5
{
    public static void main(String args[])
    {
        int[] a = new int[5];

        int even = 0;
        int odd = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++)
        {
            if(a[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("Total even elements: " + even);
        System.out.println("Total odd elements: " + odd);

    }
}