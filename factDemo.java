import java.util.*;
class factDemo
{
    public static void main(String args[])
    {
        Scanner svc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=svc.nextInt();
        int i=1,pro=1;
        while(i<=n)
        {
            pro=pro*i;
            i++;         
        }
        System.out.println(pro);
    }
}