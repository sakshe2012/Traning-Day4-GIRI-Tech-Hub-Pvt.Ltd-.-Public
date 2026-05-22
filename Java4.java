//Q4. Write a  program to find second largest element in an array.


import java.util.*;

class Java4
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

   int largest = a[0];
   int secondLargest = a[0];

      
  for(int i=1; i<5; i++)
    {
       if(a[i] > largest)
            {
                largest = a[i];
            }
       }

  
 for(int i=0; i<5; i++)
   {
       if(a[i] > secondLargest && a[i] != largest)
            {
                secondLargest = a[i];
            }
  }

System.out.println("Largest element: " + largest);
System.out.println("Second Largest element: " + secondLargest);

    }
}