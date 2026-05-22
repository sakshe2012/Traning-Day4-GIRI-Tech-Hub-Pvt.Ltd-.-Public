//Q2. Write a program to find sum of all array elements.



import java.util.*;
 class Java2
{
public static void main(String args[])
{

 int []a= new int [5];
int sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter elements of array:");
for (int i=0;i<5;i++)
{ 
  a[i]=sc.nextInt();   
}
System.out.println("elements of arrays are:");
for(int i=0;i<5;i++)
{ 
    System.out.print("\t"+a[i]);
}
int i=0;
while(i<a.length)
{
    sum=sum+a[i];
    i++;
}
System.out.println("\n sum of elements of array is:" +sum);
}
}