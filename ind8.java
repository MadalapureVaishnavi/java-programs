//Write a program in java to convert temperature in Celsius to Fahrenheit.

import java.util.Scanner; 
public class example10
{
   public static void main(String[] args) 
 {
   int cel, far;
   Scanner sc= new Scanner(System.in);
   System.out.println("Input the temperature in Celsius : ");
   int a= sc.nextInt();
   System.out.println("The temperature in Celsius is : "+a);
   cel= a;
   far = cel * 9/5 + 32;
   System.out.println("Temperature in Fahrenheit is : "+far);

  }
}