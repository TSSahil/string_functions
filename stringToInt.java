/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="sahil";
		stringToInt("12345");
		System.out.println(s);
	}
	public static void stringToInt(String s1)
	{
	   char[] s=s1.toCharArray();
	    int sum=0;
	    int j=0;
	    for(int i=s1.length()-2;i>-1;i--)
	    {
	        sum=sum+(int)((s[i]-'0')*Math.pow(10,j));
	        j++;
	    }
	    System.out.println(sum);
	    //return s.toString();
	}
}
