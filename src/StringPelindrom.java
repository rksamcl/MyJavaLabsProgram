
package com.amar;
import java.util.*;

class Find{
	String str,revstr="";
	int i;
	Find()
	    {
		System.out.println("Enter you String value to find palindrom number");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		}
		
	void revString()
	{
		int len_str= str.length();
		for(i=len_str-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
	}
	
	void display()
	{
		
		if(str.equals(revstr))
		   
			System.out.println(revstr+" is Pelindrom");
		    
		else
			System.out.println(revstr+" is not Pelindrom");
		
	}
		
}
		
class StringPelindrom {	
		
	public static void main(String[] args) {
		Find f=new Find();
		f.revString();
		f.display();
	}

}
