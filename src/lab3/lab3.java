package lab3;

import java.util.Scanner;

public class lab3 {

	static Scanner sc = new Scanner(System.in);
	static int int1;
	static String name;

	public static void main(String[] args) {
		System.out.println("Please enter your Name");
		name = sc.nextLine();
		System.out.println(
				"Now " + name + " Please input an integer between 0 and 100, stinky human named " + name + ".");
		input();
	}

	public static void input() {
		int1 = sc.nextInt();
		if (int1 <= 100) {
			cond();
		} else {
			System.out.println("Invalid input " + name + " .....program resetting");
			System.out.println(
					"Now " + name + " Please input an integer between 0 and 100, stinky human named " + name + ".");
			input();
		}
	}

	public static void cond() {
		if ((int1 % 2) == 0) {

			even();
		}
		if ((int1 % 2) != 0) {

			odd();
		}

	}

	public static void even() {
		if (int1 < 25) {
			System.out.println("Even and less than 25");
		} else if (int1 <= 60) {
			System.out.println("Even");
		} else if (int1 > 60) {
			System.out.println(int1 + " Even");
		}
		end();
	}

	public static void odd() {
		if (int1 < 60) {
			System.out.println(int1 + " Odd");
		} else if (int1 > 60) {
			System.out.println(int1 + " Odd and over 60");
		}
		end();
	}

	public static void end() {
		System.out.println("Thanks for playing " + name + " .");
	}
}
