package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("¬ведите год:");
		int year = in.nextInt();

		if (year % 4 != 0) {
			System.out.println("”казанный год не €вл€етс€ високосным.");
		} else if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("”казанный год €вл€етс€ високосным.");
			} else if (year % 400 != 0) {
				System.out.println("”казанный год не €вл€етс€ високосным.");
			} else {
				System.out.println("”казанный год €вл€етс€ високосным.");
			}
		}
		in.close();
	}

}
