//1.Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.

package org.girmit.assignments;
import java.util.*;
@FunctionalInterface
interface SquareofEvenAndSum
{
	public void sumOfEvenAndOdd();
}
//By Traditional Method
/*
class Test implements SquareofEvenAndSum
{

	@Override
	public void sumOfEvenAndOdd() {
		List<Integer> nums= Arrays.asList(2,3,4,5,6,7,8,9);
		int evenSum = 0,oddSum=0;
		for(int i: nums)
		{
			if(i%2==0)
			{
				evenSum=(int) (evenSum+Math.pow(i, 2));
			}
			else
			{
				oddSum=(int) (oddSum+Math.pow(i, 2));
			}
			
		}
		System.out.println(evenSum+oddSum);
		
	}
	
}
*/
public class Assignment1 {

	public static void main(String[] args) {
    /*
		Test t = new Test();
		t.sumOfEvenAndOdd();
		
	*/
		//By Using Lambda Expressions
		SquareofEvenAndSum t=()->{
			List<Integer> nums= Arrays.asList(2,3,4,5,6,7,8,9);
			int evenSum = 0,oddSum=0;
			for(int i: nums)
			{
				if(i%2==0)
					evenSum=(int) (evenSum+Math.pow(i, 2));
				else
					oddSum=(int) (oddSum+Math.pow(i, 2));
				
			}
			System.out.println(evenSum+oddSum);
		};
		t.sumOfEvenAndOdd();
	}

}
