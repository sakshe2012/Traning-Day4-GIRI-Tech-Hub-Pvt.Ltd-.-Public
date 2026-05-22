// Q10. Write a C program to count frequency of each element in an array.



import java.util.*;

class Java10
{
    public static void main(String args[])
    {
        int[] a = new int[5];
        int[] visited = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        for(int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
            visited[i] = 0;
        }

        for(int i=0; i<5; i++)
        {
            if(visited[i] == 1)
            {
                continue;
            }

            int count = 1;

            for(int j=i+1; j<5; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                    visited[j] = 1;
                }
            }

            System.out.println(a[i] + " occurs " + count + " times");
        }

        
    }
}