//Q 2//  Write a program to accept string from user and print how many times each character is repeating


import java.util.*;
public class Test2 {

	public static void main(String args [])
	{
		System.out.println("enter your string");
		
		Scanner scn=new Scanner(System.in) ;
		
		String s= scn.nextLine();
		
		char [] a=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	  
		
		
	}
}
