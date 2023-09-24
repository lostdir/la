import java.io.*;
//program replace a given character from a given sentence//
public class sentence {
public static void main(String args[])throws IOException{
try{
String str,str1,ch,sp;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the sentence");
	str=br.readLine();
	System.out.println("Enter the charector");
	ch=br.readLine();
           //check the entered character is present in the given sentence
	if(str.contains(ch))
			{
		      System.out.println("Enter the special charactor");
		      sp=br.readLine();
    //replace character with special character//
		      str1=str.replace(ch,sp);
		      System.out.println("Resultant sentence is"+str1);
		      
			}
	else
	System.out.println("Charactor is not present in the given sentence");
}
	catch(NullPointerException e)
	{
		System.out.println("Null pointer Exception"+e);
	}
}
}