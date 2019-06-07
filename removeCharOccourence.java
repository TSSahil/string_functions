import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="sahilsagarts";
		removeCharOccourence(s.toCharArray(),'s');
	}
	public static void removeCharOccourence(char []a,char b)
	{
	    String s="";
	    int i=0;
	    while(i<a.length-1)
	    {
	        if(a[i]!=b)
	        s+=a[i];
	        
	        i++;
	        
	    }
	    System.out.println(s);
	}
}
