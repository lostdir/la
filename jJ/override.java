import java.io.*;
class stud
{
    int rollno;
     public stud(){ }
     stud(int x)
     {
       rollno=x;
     }
    void display()
   {
     System.out.println("Rollno="+rollno);
   }
}
class mark extends stud
{
 int m1,m2;
 public mark(){}
	void getreport(int x,int y)
	{ 
                m1=x;
	  m2=y;
 	 }
	void display()
	{
 	 stud st=new stud(10);
  	 st.display();
 	 System.out.println("MARK1="+m1);
	 System.out.println("MARK2="+m2);
	}
}
class override
{
 public static void main(String args[])
 {
    mark r1=new mark();
  r1.getreport(20,30);
  r1.display();
 }
}