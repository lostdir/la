
import com.example.mypackage.area;
import java.io.*;
class rectangle
{
   static int l,b;
 public static void main(String[] args)
  {
   area ob=new area();
   try
   {
     DataInputStream dt=new DataInputStream(System.in);
    System.out.println("enter length and breadth:");
    l=Integer.parseInt(dt.readLine());
    b=Integer.parseInt(dt.readLine());
   }
   catch(Exception e){}
   int v=ob.find(l,b);
   System.out.println("area is "+v);
  }}