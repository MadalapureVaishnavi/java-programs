import java.util.*;
class arr2Demo
{
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{2,5,6},{2,3,7}};
        //System.out.println(arr[1][1]);
        //System.out.println(arr.length);
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}