import java.io.*;
class primenumber
 {
  public static void main(String[ ] args)
  {
   try
   {
    DataInputStream in=new DataInputStream(System.in);
    System.out.println("Enter number:");
    int num=Integer.parseInt(in.readLine());
    int i;
    for (i=2; i < num ;i++ )
    {
     int n = num%i;
     if (n==0)
     {
       System.out.println("not Prime!");
       break;
     }
    }
    if(i == num)
    {
      System.out.println("Prime number!");
    }
  }
  catch(Exception e){}
 }
}