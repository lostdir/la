import java.io.*;
import java.lang.*;
class fivetable extends Thread
{
 public void run()
  {
   for(int i=1;i<=5;i++)
   System.out.println(i+"Fives are"+(i*5));
  }
}
class seventable extends Thread
{
 public void run()
  {
   for(int i=1;i<=5;i++)
   System.out.println(i+"sevens are"+(i*7));
  }
}
class sixtable extends Thread
{
 public void run()
  {
   for(int i=1;i<=5;i++)
   System.out.println(i+"sixes are"+(i*6));
  }
}
public class multithread
{
 public static void main(String args[])
 {
   fivetable five=new fivetable();
   seventable seven=new seventable();
   System.out.println("\n");
   sixtable six=new sixtable();
   five.start();
   seven.start();
   six.start();
 }
}