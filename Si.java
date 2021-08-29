/*Write a program in JAVA to enter P, T, R and calculate Simple Interest.   
Sample Output:
Calculate the Simple Interest :
-----------------------------------
Input the Principle: 20000
Input the Rate of Interest: 10
Input the Time: 1.5
The Simple interest is: 3000
 */
 
import java.util.Scanner;
public class Si
{
    public static void main(String args[]) 
    {
        System.out.println("Calculate the Simple Interest :");
        System.out.println("--------------------------------");
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the Principal : ");
        p = scan.nextFloat();
        System.out.print("Input the Rate of Interest : ");
        r = scan.nextFloat();
        System.out.print("Input the Time : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("The Simple interest is: " +sinterest);
    }
}