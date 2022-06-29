
//3  Q//  Write a Calculator program which perform any 4 math operations by using functions for each operation


import java.util.*;
public class Test3 {
public static void main(String args[])
	
	{
		Scanner scn=new Scanner(System.in);
		
		
		System.out.println("enter first number");
		int n1=scn.nextInt();
		
		
		
		System.out.println("enter second  number");
		int n2=scn.nextInt();

		scn.nextLine();
		
		System.out.println("enter operation you want");
String s=scn.nextLine();

switch(s)
{

case "*":
	
	int  result=n1*n2;
	System.out.println(result);
	break;
	
case "+":
	 result=n1+n2;
	System.out.println(result);
	break;
	
case "-":
	 result=n1-n2;
	System.out.println(result);
	break;
	
case "/":

  result=n1/n2;
	System.out.println(result);
	break;

	default:
		System.out.println("invalid symbol");

}



	}
}
