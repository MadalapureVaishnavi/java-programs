//Write a program in java to calculate the volume of a cylinder

import java.lang.Math.*;
import java.util.*;
public class cylinderv {
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Calculate the volume of a cylinder :");
		System.out.println("--------------------------------------");
		
		System.out.print("Input  the radius of cylinder:");
		int r=sw.nextInt( ) ;       //radius
	System.out.print("Input  the height of cylinder:");
		int h=sw.nextInt( ) ;  
	   double v;                                //volume
	double PI=3.14;
		v= PI*r*r*h;
		System.out.println("The volume of a cylinder is : " + v);
		
	}
}