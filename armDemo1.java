import java.util.*;
class armDemo1
{
    public static void main(String args[])
    {
        
        int n=371;
        int r=0,pro=0,sum=0;
        while(n!=0)
        {
            r=n%10;
            pro=r*r*r;
            sum=sum+pro;
            n=n/10;
        }
        System.out.println(sum);
        if(sum == n)
        {
            System.out.println("no is armstrong");
        }
        else
        {
            System.out.println("no is not armstrong");
        }
    }
}