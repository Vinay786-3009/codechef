import java.util.*;
import java.lang.*;
import java.io.*;

class papercutting
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=(a/b)*(a/b);
	    System.out.println(c);
	}

	}
}

