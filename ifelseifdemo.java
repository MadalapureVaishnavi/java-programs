import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class ifelseifdemo
{
    public static void main(String args[])
    {
        System.out.print("enter your marks:");
        Scanner svc=new Scanner(System.in);
        int marks=svc.nextInt();
        if(marks>=35 && marks<=50)
        {
        System.out.println("pass");
        }
        else if(marks>=50 && marks<=70)
        {
        System.out.println("A");
        }
        else if(marks>=70 && marks<=80)
        { 
        System.out.println("A+");
        }
        else if(marks>=80 && marks<=90)
        {
            System.out.println("A++");
        }
        else
        {
        System.out.println("fail");
    }
}
}