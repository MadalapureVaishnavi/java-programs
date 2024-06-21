// Write a program in java to find the area of any triangle using Heron's Formula.

import java.lang.Math.*;
import java.util.*;
public class trianglev {
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Find the area of any triangle using Heron's Formula :");
	
			System.out.println("-----------------------------------------------------");
		
		System.out.print("Input the length of 1st side of the triangle :");
	
			double a=sw.nextDouble( ) ;       //radius
		System.out.print("Input the length of 2nd side of the triangle :");
	
			double b=sw.nextDouble( ) ; 
			System.out.print("Input the length of 3rd side of the triangle :");
	
			double c=sw.nextDouble( ) ;  

		double s,h;
		s=(a+b+c)/2;
       h=Math.sqrt(s* (s-a)* (s-b)* (s-c)) ;  //area
      
		System.out.println("The area of triangle is : " + h);

	}
}