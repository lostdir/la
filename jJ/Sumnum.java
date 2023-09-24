import java.util.Scanner;

public class Sumnum
{
       
   
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int num; 
        System.out.println("Enter the number");
        num=sc.nextInt();   
        
        int sum=0;  
        for(int i=1; i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of natural numbers is "+sum);
     }
}