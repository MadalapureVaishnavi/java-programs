//Write a program in java to calculate the volume of a sphere. 

import java.lang.Math.*;
import java.util.*;
public class Cubev {
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Calculate the volume of a cube :");
		System.out.println("-------------------------------------- -");
		
		System.out.print("Input  the side of cube:");
		int s=sw.nextInt( ) ;       //radius
	   int v;                                //volume
		v= s*s*s;
		System.out.println("The volume of a cube is : " + v);
			
	}
}