import java.io.*;
class matrix
{
    public static void main(String args[])
{
int m,n,p,q,i,j,k=0;
try
{
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order of 1st matrix:");
m=Integer.parseInt(br.readLine());
n=Integer.parseInt(br.readLine());
System.out.println("Enter order of 2nd matrix:");
p=Integer.parseInt(br.readLine());
q=Integer.parseInt(br.readLine());
if(n!=p)
System.out.println("Not possible");
else
{
System.out.println("Enter elmts of first matrix:");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
System.out.println("1st matrix is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
System.out.println(a[i][j]+"");
System.out.println();
}
System.out.println("Enter elmts of second matrix:");
for(i=0;i<p;i++)
for(j=0;j<q;j++)
b[i][j]=Integer.parseInt(br.readLine());
System.out.println("2nd matrix is:");
for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
System.out.println(b[i][j]+"");
System.out.println();
}
for(i=0;i<m;i++)
for(j=0;j<q;j++)
for(k=0;k<n;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
System.out.println("Resultant matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
System.out.println(c[i][j]+"");
System.out.println();
}
}
}
catch(Exception e){}
}
}