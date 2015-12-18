package com.amar;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
		System.out.println("Enter the any Integer value--hello");
		Scanner nm=new Scanner(System.in);
		int n=nm.nextInt();
		int res,sum=0;
	    int tem=n;
	    while(n>0)
	     {
	       res=n%10;
	       sum=sum+res*res*res;
	       n=n/10;
	     }
	      if(sum==tem)
	       {
	       System.out.println(tem+" is Armstrong");
	       }
	      else
	       { 
		     System.out.println(tem+" is Not Armstrong");
	       }
	    }
     }
