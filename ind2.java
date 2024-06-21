//Write a program in java to calculate the volume of a sphere.   

import java.lang.Math.*;
import java.util.*;
public class Spherev {
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Calculate the volume of a sphere :");
		System.out.println("--------------------------------------");
		
		System.out.print("Input  the radius of sphere:");
		int r=sw.nextInt( ) ;       //radius
	   double v;                                //volume
	double PI=3.14;
		v= (4.0/3.0)*PI*r*r*r;
		System.out.println("The volume of a sphere is : " + v);
		
		
	}
}