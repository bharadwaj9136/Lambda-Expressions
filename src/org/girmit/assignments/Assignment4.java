//4.implement the calculator with Addition, Subtraction, Multiplication, Division and Modules.
//(use switch case to choose operations like Addition, Subtraction, Multiplicaton etc, and use Scanner class to take input.)
package org.girmit.assignments;

import java.util.Scanner;

interface calculator
{
	public void operation();
}
//By Using Traditional Methods
/*
class Test implements calculator
{

	@Override
	public void operation() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Two Numbers");
		double i=sc.nextInt();
		double j = sc.nextInt();
		System.out.println("Enter an Operator(+,-,*,/");
		char operation=sc.next().charAt(0);
		double result=0;
		switch(operation)
		{
		case '+':
			result =i+j;
			System.out.println("Addition of Two Values="+result);
			break;
		case '-':
			result =i-j;
			System.out.println("Subtraction of Two Values="+result);
			break;
		case '*':
			result =i*j;
			System.out.println("Multiplication of Two Values="+result);
			break;
		case '/':
			result =i/j;
			System.out.println("Division of Two Values="+result);
			break;
		default:
			System.out.println("Invalid Operator");
			
		}
	}
	
}
*/
public class Assignment4 {

	public static void main(String[] args) {
		/*
		Test t = new Test();
		t.operation();
        */
		//By Using Lambda Expressions
		calculator opr = ()->{

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Two Numbers");
			double i=sc.nextInt();
			double j = sc.nextInt();
			System.out.println("Enter an Operator(+,-,*,/");
			char operation=sc.next().charAt(0);
			double result=0;
			switch(operation)
			{
			case '+':
				result =i+j;
				System.out.println("Addition of Two Values="+result);
				break;
			case '-':
				result =i-j;
				System.out.println("Subtraction of Two Values="+result);
				break;
			case '*':
				result =i*j;
				System.out.println("Multiplication of Two Values="+result);
				break;
			case '/':
				result =i/j;
				System.out.println("Division of Two Values="+result);
				break;
			default:
				System.out.println("Invalid Operator");
				
			}
		};
		opr.operation();
		
	}

}
