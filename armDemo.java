import java.util.*;
class armDemo
{
    public static void main(String args[])
    {
        Scanner svc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=svc.nextInt();
        int r=0,pro=0,sum=0;
        while(n!=0)
        {
            r=n%10;
            pro=r*r*r;
            sum=sum+pro;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==n)
            System.out.println("no is armstrong");       
        else
        
            System.out.println("no is not armstrong");
        
    }
}