/*Java Program to Find ASCII Value of a Character*/

public class Ascii
{
public static void main(String[] args) 
{
char ch = 'b';
int ascii = ch;
int castAscii = (int) ch;

System.out.println("The ASCII value of " + ch + " is: " + ascii);
System.out.println("The ASCII value of " + ch + " is: " + castAscii);
}
}