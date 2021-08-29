//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.


import java.util.*;
public class SumUser{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System. in);


		char choice;
		do {
			System.out.print("enter the first number:");
			int num1 = sc.nextInt();
			System.out.print("enter the second number:");
			int num2 = sc.nextInt();
			int sum = num1 + num2;
			System.out.println("sum of first and second no.:" + sum);
			System.out.print("Do you want to continue y/n? ");
			choice = sc.next().charAt(0);

			System.out.println();

		}

		while (choice == 'y' || choice == 'n');


	}
}

