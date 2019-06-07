

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int sum=0;
    static int i;
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abcd123cf25e";
		stringSum(s.toCharArray());
		
		System.out.println("sum of "+s+" is "+sum);
	}
	public static void stringSum(char []a)
	{
	    for(i=0;i<a.length;i++)
	    {
	        if(a[i]>='0'&&a[i]<='9')
	        {
	            calculate(a);
	        }
	        
	    }
	}
	public static void calculate(char a[])
	{
	    String s="";
	    while(a[i]>='0'&&a[i]<='9')
	    {
	        s=s+a[i];
	        i++;
	    }
	    sum+=Integer.parseInt(s);
	}
}
