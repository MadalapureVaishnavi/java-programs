public class Ind16{
public static void main(String args[])
{
System.out.println("Display the operation of pre and post increment and decrement :");
System.out.println("-----------------------------------------------------------");

int n=57;
System.out.println("the number is: " + n++);

System.out.println("After post increment by 1 the number is : "+  n);
System.out.println("After pre increment by 1 the number is :  "+ ++n);
n++;
System.out.println("After increasing by 1 the number is : "+ n--);

System.out.println("\nAfter post decrement by 1 the number is : "+  n);
System.out.println("After pre decrement by 1 the number is :  "+ --n);
n--;
System.out.println("After decreasing by 1 the number is : "+ n);
}
}