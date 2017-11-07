package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Введите четное и нечетное числа:");
		int a = in.nextInt();
		int b = in.nextInt();

		if (a % 2 == 0) {
			System.out.println("Нечетное число: " + b);
		} else {
			System.out.println("Нечетное число: " + a);
		}
		in.close();
	}
}
