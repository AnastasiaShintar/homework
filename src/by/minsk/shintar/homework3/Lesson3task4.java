package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("¬ведите четырехзначное число:");
		int number = in.nextInt();

		int f = number / 1000;
		int s = (number / 100) % 10;
		int t = (number / 10) % 10;
		int fr = number % 10;

		int ab = f * s;
		int bc = t * fr;
		int sum = ab + bc;

		System.out.println(sum);

		in.close();
	}

}
