//Write a program in java to find the Area and Perimeter of a Rectangle.   

import java.lang.Math.*;
import java.util.*;
public class Rectangle{
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Find the Area and Perimeter of a Rectangle :");
		System.out.println("---------------------------------------------");
		
		System.out.print("Input  the length of Rectangle:");
		int l=sw.nextInt( ) ;       //radius
		System.out.print("Input  the width of Rectangle:");
		int w=sw.nextInt( ) ;  
	   int a,p;              // a=area,p=perimeter of rectangle
		a=l*w;
		p=(l+w)*2;
		System.out.println("The area of Rectangle is : " + a);
			System.out.println("The perimeter of Rectangle is : " + p);
		
	}
}