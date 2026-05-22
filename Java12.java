// Q12. Write a  program to count total number of duplicate elements in an array.



import java.util.*;

class Java12
{
 public static void main(String args[])
    {
        int[] a = new int[5];
        int duplicate = 0;

 Scanner sc = new Scanner(System.in);

  System.out.println("Enter array elements:");

 for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }

for(int i=0; i<5; i++)
        {
            for(int j=i+1; j<5; j++)
            {
                if(a[i] == a[j])
                {
                    duplicate++;
                    break;
                }
            }
        }

 System.out.println("Total duplicate elements: " + duplicate);


    }
}