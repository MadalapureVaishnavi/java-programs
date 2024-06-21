// Write a program in C++ to add two numbers accept through keyboard


import java.lang.Math.*;
import java.util.*;
public class Add {
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Addition of two numbers:");
		System.out.println("-------------------------------------- -");
		
		System.out.print("Input  the first number:");
		int a=sw.nextInt( ) ;     
		
		  	System.out.print("Input  the second number:");
		int b=sw.nextInt( ) ;     

   int c;
   c=a+b;
		System.out.println("addition: " + c);
			
	}
}