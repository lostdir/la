import java.io.*;
class area
{
 int l,b;
  double r;
  public void area(int x,int y)
	{
	  l=x;
	  b=y;
	  System.out.println("Area="+x*y);
	}
	void area(double m)
        {
         r=m;
	 System.out.println("Area="+3.14*m*m);
	}
}
class mainol
{
 public static void main(String args[])
{
try 
{
 DataInputStream in=new DataInputStream(System.in);
 area a=new area();
 int ch=1;
 while(ch!=3)
{ 
 System.out.println("1.Rectangle 2.Circle");
 System.out.println("Enter your choice:");
 ch=Integer.parseInt(in.readLine());
 switch(ch)
{
 case 1:System.out.println("Enter the side:");
	int p=Integer.parseInt(in.readLine());
	int q=Integer.parseInt(in.readLine());
             a.area(p,q);
	 break;
     case 2:System.out.println("Enter the radius:");
	    double s=Double.parseDouble(in.readLine());
                  a.area(s);
	    break;
     default: System.out.println("invalid statement");
                  ch=4;
  }  }
 }
catch(Exception e){}
}
}
