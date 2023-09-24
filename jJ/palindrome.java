import java.io.*;
class palindrome
{
 public static void main(String [] args)
{
 try
{
 int n,rem,d=0,m;
 DataInputStream in=new DataInputStream(System.in);
 System.out.println("Enter a number");
 n=Integer.parseInt(in.readLine());
 m=n;
 while(n>0)
{
 rem=n%10;
 d=rem+10*d; 
 n=n/10;
}
if(d==m)
 System.out.println("The number is palindrome");
else
 System.out.println("The number is not palindrome");
}
catch(Exception e){}
}
}