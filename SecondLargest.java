/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package secondlargest;

/**
 *
 * @author win7
 */
import java.util.*;
public class SecondLargest
{
public static void main(String args[]) 
{
System.out.println("PROGRAM FOR FINDING THE SECOND HIGHEST NUMBER IN AN ARRAY");
System.out.println("ENTER THE SIZE OF THE ARRAY");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
for (int i = 0; i< n; i++) 
{
arr[i] = sc.nextInt();
}
int secondLargest = findSecondLargest(arr);
System.out.println("The Second Highest Number is "+ secondLargest);
}
static int findSecondLargest(int[] arr)
{
int max=Integer.MIN_VALUE;
int secondLargest=Integer.MIN_VALUE;
System.out.println(max);
System.out.println(secondLargest);
System.out.println(arr.length);
for(int i=0;i<arr.length;i++)
{
if(max<arr[i])
{
secondLargest=max;
max=arr[i];
}
else if(secondLargest<arr[i])
{
secondLargest=arr[i];
}
}
return(secondLargest);
}
}