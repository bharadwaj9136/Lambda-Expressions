//3. Write a Java program to implement a lambda expression to concatenate two strings.
package org.girmit.assignments;
@FunctionalInterface
interface concatenateTwoStrings
{
	public void ToString();
}
//By Traditional way
/*
class Test implements concatenateTwoStrings
{

	@Override
	public void ToString() {

		String s1 = "Hello ";
		String s2 = "World";
		s1=s1.concat(s2);
		System.out.println(s1);
	}
	
}
*/
public class Assignment2 {

         public static void main(String[] args) {
        	 /*
        	 Test t1 = new Test();
        		t1.ToString();
        	*/
        	 //By Lambda Expressions
        	 concatenateTwoStrings c1 = ()-> {
        			String s1 = "Hello ";
        			String s2 = "World";
        			s1=s1.concat(s2);
        			System.out.println(s1);
        		};
        		c1.ToString();
        	 
		}
	

}
