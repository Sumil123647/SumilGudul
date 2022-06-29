//Q2//  Write a program to separate Numbers, characters and alphabets from the any given string .Ex: "12!#$ab2954"
public class Test 
{
	public static void main(String args [])
	{
		String s= "12!#$ab2954" ;
		
		char [] a=s.toCharArray();
		
	for(int i=0;i<a.length;i++)
	{
			if(a[i]<=122&&a[i]>=97)
			{
				System.out.print(a[i]+" ");
		   }
		}
	System.out.println();
	
	for(int i=0;i<a.length;i++)
	{
if(a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9')
{
	System.out.print(a[i]);
}
	}
	System.out.println();

	
		
	for(int i=0;i<a.length;i++)
	{
if(a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9')
{
	a[i]='0';
}

if(a[i]<=122&&a[i]>=97)
{
	a[i]='0';
	}
		if(a[i]!='0')
		{
			System.out.print(a[i]);
		}
		
		}
		
		

		}
}






























