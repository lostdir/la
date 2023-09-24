import FACTORIAL.*;
import java.io.*;

class NpR{
	   public static void main(String [] args) throws IOException
	    {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		Fact fa= new Fact();
		
		System.out.println("Enter the Number 'N':");
		int n=Integer.parseInt(br.readLine());

		System.out.println("Enter the Number 'R':");
		int r=Integer.parseInt(br.readLine());

		int p=n-r;
		long num=fa.factorial(n);
System.out.println("Num:"+num);
System.out.println("p:"+p);
		long denom=fa.factorial(p);
System.out.println("denom:"+denom);
		long npr=num/denom;
		System.out.println(n+"P"+r+" = "+npr);
	    }
}