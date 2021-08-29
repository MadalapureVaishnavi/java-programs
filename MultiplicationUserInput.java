//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 

import java.util.*;
public class MultiplicationUserInput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);
			System.out.print("enter the number:");
		int num=sc.nextInt( );
		for(int i=1;i<=10;i++)

				System.out.println(+num+"*"+i+"="+i*num);
	}
	}