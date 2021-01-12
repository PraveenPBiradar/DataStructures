package Strings;

public class ReverseString 
{
	public static String reverseWord(String str)
	{
		String revStr="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			revStr=revStr+ch[i];
		}
		return revStr;
	}
}
