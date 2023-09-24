import java.io.*;
import java.util.*;

class PerfectNum{
  		public static void main(String [] args)
		{
		  int n,i,s=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		
		  for(i=1;i<n;i++)
		    {
 			if(n%i==0)
			{
			 s=s+i;
			}
		
                    }
		if(n==s)
		{
		System.out.println(n+" is Perfect Number"); 
		}
	        else
		{
		System.out.println(n+" is not a Perfect Number"); 
		}
	}
}