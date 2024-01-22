//2. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
package org.girmit.assignments;
interface palendromeAreNot
{
	public void palendrome();
}
//By Using Traditional Way
/*
class Test implements palendromeAreNot
{

	@Override
	public void palendrome() {
		
		String s1 = "mam";
		String s2="";
		boolean f=false;
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		if(s2.equals(s1)) {
			f=true;
		}
		System.out.println(f);
	}
	
}
*/
public class Assignment3 {
	
	public static void main(String[] args) {
		/*
		Test t= new Test();
		t.palendrome();
		*/
		//By Using Lambda Expressions
		palendromeAreNot p=()-> {
			String s1 = "mam";
			String s2="";
			boolean f=false;
			for(int i=s1.length()-1;i>=0;i--)
			{
				s2+=s1.charAt(i);
			}
			if(s2.equals(s1)) {
				f=true;
			}
			System.out.println(f);
		};
		p.palendrome();
	}
}
