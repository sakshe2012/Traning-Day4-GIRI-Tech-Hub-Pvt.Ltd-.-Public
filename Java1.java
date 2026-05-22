//Q1. Write a  program to input and print elements of an array.

import java.util.*;
 class Java1
{
public static void main(String args[])
{
 int []a= new int [5];
Scanner sc= new Scanner(System.in);
System.out.println("enter elements of array:");
for (int i=0;i<5;i++)
{ 
  a[i]=sc.nextInt();   
}
System.out.println("elements of arrays are:");
for(int i=0;i<5;i++)
{ 
    System.out.println(a[i]);
}
}
}