package org.perscholas.exercise;

import java.util.Scanner;

/*
 *  Create a program that lets the 
 *  users input their filing status and income. 
 *  Display how much tax the user would have to pay according to status and income.
 * 
 * 
 * **/
public class TaxCalc {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please  select your filing status  ");
		System.out.println(" 1 : single");
		System.out.println(" 2 : Married Filing Jointly");
		System.out.println(" 3 : Married Filing Separately");
		System.out.println(" 4 : Head of Household");

		int status = sc.nextInt();

		System.out.println("Please  inter your anual income ");

		double income = sc.nextDouble();

		sc.close();

		myTaxCalculator(status, income);

	}// main

	private static void myTaxCalculator(int status, double income) {
		double taxVal = 0;

		switch (status) {
		case 1: {
			if (income > 372951) {
				taxVal = income * 35 / 100;

			} else if (income >= 171551 || income <= 372950) {
				taxVal = income * 33 / 100;

			} else if (income >= 82251 || income <= 171550) {

				taxVal = income * 28 / 100;

			} else if (income >= 33951 || income <= 82250) {

				taxVal = income * 25 / 100;

			} else if (income >= 8351 || income <= 33950) {

				taxVal = income * 15 / 100;

			} else if (income > 0 || income <= 8350) {

				taxVal = income * 10 / 100;
			}
			break;
		}
		case 2: {
			if (income > 372951) {
				taxVal = income * 35 / 100;

			} else if (income >= 208851 || income <= 372950) {
				taxVal = income * 33 / 100;

			} else if (income >= 137051 || income <= 208850) {

				taxVal = income * 28 / 100;

			} else if (income >= 67901 || income <= 137050) {

				taxVal = income * 25 / 100;

			} else if (income >= 16701 || income <= 67900) {

				taxVal = income * 15 / 100;

			} else if (income > 0 || income <= 16700) {

				taxVal = income * 10 / 100;
			}
			break;
		}
		case 3: {
			if (income > 186476) {
				taxVal = income * 35 / 100;

			} else if (income >= 104426 || income <= 186475) {
				taxVal = income * 33 / 100;

			} else if (income >= 68526 || income <= 104425) {

				taxVal = income * 28 / 100;

			} else if (income >= 33951 || income <= 68525) {

				taxVal = income * 25 / 100;

			} else if (income >= 8351 || income <= 33950) {

				taxVal = income * 15 / 100;

			} else if (income > 0 || income <= 8350) {

				taxVal = income * 10 / 100;
			}
			break;

		}
		case 4: {
			if (income > 372951) {
				taxVal = income * 35 / 100;

			} else if (income >= 190201 || income <= 372950) {
				taxVal = income * 33 / 100;

			} else if (income >= 117451 || income <= 190200) {

				taxVal = income * 28 / 100;

			} else if (income >= 45501 || income <= 117450) {

				taxVal = income * 25 / 100;

			} else if (income >= 11950 || income <= 45500) {

				taxVal = income * 15 / 100;

			} else if (income > 0 || income <= 11950) {

				taxVal = income * 10 / 100;
			}
			break;
		}
		default:
			System.out.println("you did not select the correct value \n");
			break;

		}

		System.out.print("your estimated tax value will be : " + taxVal);

	}
}
