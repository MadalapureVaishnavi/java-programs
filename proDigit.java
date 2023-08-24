import java.util.*;
class proDigit
{
    public static void main(String args[])
    {
        Scanner svc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=svc.nextInt();
         
        int r=0,prod=1;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            prod=prod*r;  
        }
        System.out.print("Product of digit is:"+prod);
    }
}