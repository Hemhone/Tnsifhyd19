package com.day1;

import java.util.Iterator;
import java.util.Scanner;

public class Prog3 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the fact");
		int no= s.nextInt();
		int factorial= 1;
		for (int i = 1; i < no; i++) {
            factorial *= i;
		}
		System.out.println("Factorial of " + no + " is " + factorial);
	}

}
