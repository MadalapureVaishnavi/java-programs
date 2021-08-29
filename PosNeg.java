/* Write a program in JAVA to check whether a number is positive, negative or zero.   
Sample Output:
The number is positive.
 */
 
 public class PosNeg
{  
public static void main(String[] args)   
{  
int num=714;  
//checks the number is greater than 0 or not  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
//checks the number is less than 0 or not  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}