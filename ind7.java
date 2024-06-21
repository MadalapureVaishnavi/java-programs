import java.lang.Math.*;
import java.util.*;
public class Circle{
	public static void main(String[] args) {
		Scanner sw=new Scanner(System.in);
		System.out.println("Find the area and circumference of any circle:");
		System.out.println("-------------------------------------------------");
		
		System.out.print("Input the radius(1/2 of diameter) of a circle:");
		int r=sw.nextInt( ) ;       //radius
		double pi=3.14;
	  double a,c;         //area,circumference of circle
	  
	  a=pi*r*r;
	  c=2*pi*r;
		System.out.println("The area of circle is : " + a);
			System.out.println("The circumference of the circle is :" + c);
		
	}
}