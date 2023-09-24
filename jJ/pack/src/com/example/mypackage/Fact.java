package com.example.mypackage.FACTORIAL; // user defined package FACTORIAL
public class Fact
{
  int n;
long facto=1;
public long factorial(int i)
   {
	n=i;  
	for(int j=1;j<=n;j++)
    	 {
      		facto*=j;
     	 }
	return(facto);
   }
}