// Q13. Write a  program to delete all duplicate elements from an array.


import java.util.*;

class Java13
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

System.out.println("Array after removing duplicates:");

for(int i=0; i<5; i++)
        {
            int count = 0;

            for(int j=0; j<i; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }

 if(count == 0)
            {
                System.out.print(a[i] + "\t");
            }
 }


}
}