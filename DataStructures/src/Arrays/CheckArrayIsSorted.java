package Arrays;

import java.util.Scanner;

public class CheckArrayIsSorted 
{
	public static void main(String[] args) 
	{
		int arr[] = {90, 80, 100, 70, 40, 30};
		boolean flag=arraySortedOrNot(arr, arr.length);
		System.out.println(flag);
	}
	
	static boolean arraySortedOrNot(int[] arr, int n) {
	       for(int i=1;i<arr.length;i++)
	       {
	           if(arr[i]<arr[i-1])
	           {
	               return false;
	           }
	           
	       }
	       return true;
	    }
}
