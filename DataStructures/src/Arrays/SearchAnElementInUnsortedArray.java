package Arrays;

import java.util.Scanner;

public class SearchAnElementInUnsortedArray 
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
		System.out.println("enter element to search");
		int x=scn.nextInt();
		boolean res=searchElement(arr,n,x);	
		System.out.println(res);
	}

	static boolean searchElement(int[] arr, int n,int x) 
	{
		for (int i = 0; i < n; i++) 
		{
		if(arr[i]==x)
		{
			return true;
		}
		}
		return false;
	}
}
