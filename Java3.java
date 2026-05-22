//Q3. Write a  program to find maximum and minimum element in an array.


import java.util.*;
 class Java3
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
    System.out.println(+a[i]);
}
int max=a[0];
int min=a[0];
for(int i=1;i<a.length;i++)
{
  if(a[i]>max)
{
       max=a[i];
}
if(a[i]<min)
{
   min=a[i];
}
}
System.out.println("Maximum element: " + max);
System.out.println("Minimum element: " + min);

}
}