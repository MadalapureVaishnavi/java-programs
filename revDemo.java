import java.util.*;
class revDemo
{
    public static void main(String args[])
    {
        Scanner svc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=svc.nextInt();
        int r=0,s=0;
        while(n!=0)
        {
            r=n%10; 
            //s=s*10+r;
            n=n/10;
            System.out.print(r);
        }
        //System.out.println(s);

    }
}