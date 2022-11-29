package org.perscholas.exercise;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String[] args) {

		/*
		 * 1.Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if statement to print out “Less than 10” if x is less than 10.
		 * Change x to equal 15, and notice the result (console should not display
		 * anything).
		 **/
		System.out.println(" \n Ans Q# 1\n");

		int num = 17;

		if (num < 10) {
			System.out.println("Less than 10");
		}

		/*
		 * 2. Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if-else statement that prints out “Less than 10” if x is less
		 * than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and
		 * notice the result
		 */
		System.out.println(" \n Ans Q# 2\n");

		if (num < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}

		/*
		 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */

		System.out.println(" \n Ans Q# 3\n");

		if (num < 10) {

			System.out.println("Less than 10");

		} else if (num > 10 && num < 20) {

			System.out.println("It is greater than 10 but less than 20");

		} else {

			System.out.println("Greater than or equal to 20");
		}

		/*
		 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 **/

		System.out.println(" \n Ans Q# 4\n");

		if (num < 10 || num > 20) {

			System.out.println("Out of range");

		} else if (num >= 10 && num <= 20) {

			System.out.println("In range");
		}

		/*
		 * 5. Write a program that uses if-else-if statements to print out grades A, B,
		 * C, D, F according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
		 * 60-69 F: <60
		 * 
		 */

		System.out.println(" \n Ans Q# 4\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter the assesment result number :");

		int val = sc.nextInt();
		sc.close();

		if (val >= 90 && val <= 100) {
			System.out.println("A");
		} else if (val >= 80) {
			System.out.println("B");
		} else if (val >= 70) {
			System.out.println("C");
		} else if (val >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		

	}

}
