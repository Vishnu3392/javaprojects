package demo1;

import java.util.Scanner;

public class Calculator {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the first number");

		double a=sc.nextDouble();

		System.out.println("enter the second number");

		double b=sc.nextDouble();

		System.out.println("choose operation(+,-,*,/):");

		

		char operator=sc.next().charAt(0);

		double result;

		switch(operator) {

		case '+':

			result=a+b;

			System.out.println("result:"+result);

			break;

		case '-':

			result=a-b;

			System.out.println("result:"+result);

			break;

		case '*':

			result=a*b;

			System.out.println("result:"+result);

			break;

		case '/':

			if(b!=0) {

			result=a/b;

			System.out.println("result:"+result);

			}else {

				System.out.println("unable to division with 0");

			}

			break;

		default:

			System.out.println("invalid operator.");

		}}}

		