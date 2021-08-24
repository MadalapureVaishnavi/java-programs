// Write a program in java to swap two numbers.   

import java.util.*;
public class Swap {
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Swap two numbers:");
		System.out.println("-------------------");
		
		System.out.print("Input 1st number:");
		int a=sw.nextInt( );
		System.out.print("Input 2st number:");
		int b=sw.nextInt( );
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping the 1st number is : " + a);
		System.out.print("After swapping the 2st number is : " + b);
		
	}
}