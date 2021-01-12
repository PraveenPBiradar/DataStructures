package Arrays;

public class LargestElementInArray 
{
public static void main(String[] args) 
{
int[] arr= {34,445,14,20,51};
int large=arr[0];
for (int i = 1; i < arr.length ; i++) 
{
	if(arr[i]>large)
	{
		large=arr[i];
	}
}
System.out.println("largest element "+large);
}
}
