import mypackage.*;
import java.io.*;
public class rectangle
{
   static int l,b;
 public static void main(String args[])
 {
   Area ob=new Area();
   try
   {
     DataInputStream dt=new DataInputStream(System.in);
    System.out.println("enter length and breadth:");
    l=Integer.parseInt(dt.readLine());
    b=Integer.parseInt(dt.readLine());
   }
   catch(Exception e){}
   int v=ob.find(l,b);
   System.out.println("area is"+v);
  }}