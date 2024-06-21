/*Write a program to print following
pattern

        1
      222
    33333
  4444444
555555555

*/
public class StarPattern5
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5 - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}