public class Ind16{
public static void main(String args[])
{
System.out.println("Check overflow/underflow during various arithmetical operation :Range of int is [-2147483648, 2147483647]:");
System.out.println("----------------------------------------------------");

int n = 2147483647;      
System.out.println("Overflow the integer range and set in minimum range : " +( n+1));
System.out.println("Increasing from its minimum range : "+ (n+2));
System.out.println("product is :"+(n*n));

int n2 = -2147483648;
System.out.println("Underflow the range and set in maximum range :  " +( n2-1));
System.out.println("Decreasing from its maximum range :  "+ (n2-2));
System.out.println("product is :"+(n2*n2));

}
}