import java.io.*;
class sortname
{
 static String name[]={"rinu","arya","athira","ejo"};
 public static void main(String args[])
{
  try
 {
  int size=name.length;
  String temp=null;
  for(int i=0;i<size;i++)
  {
   for(int j=i+1;j<size;j++)
   {
    if((name[j].compareTo(name[i]))<0)
   {
    temp=name[j];
    name[j]=name[i];
    name[i]=temp;
   }
  }
 }
 for(int i=0;i<size;i++)
 {
  System.out.println(name[i]);
 } 
}
 catch(Exception e){}
}
}