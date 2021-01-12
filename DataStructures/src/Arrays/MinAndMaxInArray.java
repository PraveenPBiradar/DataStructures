package Arrays;

public class MinAndMaxInArray 
{
public static void main(String[] args) 
{
int arr[]= {101,21,3,4,2,78};
//int arr[]= {11};	
int max=0;
int min=0;
for (int i = 1; i < arr.length; i++) 
{
	if(arr[i]>arr[max])
	{
		max=i;
	}
	if(arr[i]<arr[min])
	{
		min=i;
	}
}
System.out.println("max elem "+arr[max]);
System.out.println("min elem "+arr[min]);
}
}
