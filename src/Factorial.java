//write a program to find a factorial of a given number
package com.raj.java;

public class Short {
	public static void main(String[] args) {
    int fact=1,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number to be factorial");
     n=sc.nextInt();
     
     if(n<0)
     {
    	 System.out.println("the number is negative no");
     }
     else{
    	 for(int i=1;i<=n;i++)
    	 {
    		 fact=fact*i;
    		 System.out.println("the factorial of +n no is:"+fact);
    	 }
     }
	}
}