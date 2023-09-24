import java.io.*;
class MyStack
{
 int maxsize,top;
 int stak[];

 MyStack(int n) //parmeterised constructor
{
 maxsize=n;
 stak=new int[maxsize];
 top=-1;
} 

boolean underFlow()
{
 if(top==-1)
 return true;
else 
return false;
}
boolean overFlow()
{
if(top==maxsize-1)
  return true;
else
 return false;
}
void push(int item)
{
 top++;
 stak[top]=item;
 }
int pop()
 {
      int x=stak[top];
     top--;
  return x;
  }
}


class MyStackAppln
{
public static void main(String[] ar) throws IOException
{
  MyStack st;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the stack size:");
int size=Integer.parseInt(br.readLine());
st=new MyStack(size);
//for(int i=0;i<size;i++)
String opt,str;
do{
	System.out.println("** MENU **");
	System.out.println("_______________");
	System.out.println("1. PUSH");
	System.out.println("2. POP");
	System.out.println("3. EXIT");
	System.out.println("________________");
                System.out.println("Enter your choice");
                 int c=Integer.parseInt(br.readLine());
	switch(c){
            		case 1: if(!st.overFlow())
			{
			System.out.println("ITEM to be inserted is:");
			int it=Integer.parseInt(br.readLine());
			st.push(it);
			break;
			}
		            else{
 			System.out.println(" !!!!!STACK OVERFLOW!!!!");
			break;
			}
		case 2:if(!st.underFlow())
			{
			System.out.println("ITEM removed is:"+st.pop());
			break;
			}
		           else{
 			System.out.println(" !!!!!STACK UNDERFLOW!!!!");
			break;
			}
		case 3:break;
	          }
	System.out.println(" Do U want to continue(type Y/N)?");
	 opt=(br.readLine());
str=opt.toUpperCase();
	}while(!"N".equals(str));
 }
}