package Arrays;

import java.util.Scanner;

public class SecondLargestInArray 
{
public static void main(String[] args) 
{
	Scanner scn=new Scanner(System.in);
	System.out.println("enter size of array");
	int size=scn.nextInt();
	int arr[]=new int[size];
	int n=arr.length;
	System.out.println("enter "+size+" elements to the array");
	for (int i = 0; i < arr.length; i++) 
	{
	arr[i]=scn.nextInt();	
	}
	int res=-1,largest=0;
	for (int i = 1; i < arr.length; i++) 
	{
		if(arr[i]>arr[largest])
		{
			res=arr[largest];
			arr[largest]=arr[i];
		}
		else if(arr[i]!=arr[largest])
		{
			if(res==-1 || arr[i]>arr[largest])
			{
				res=arr[i];
			}
		}
	}
	System.out.println("second largest "+res);
}
}
