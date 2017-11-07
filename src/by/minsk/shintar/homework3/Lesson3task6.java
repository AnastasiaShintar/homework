package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task6 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Введите целое число:");
		int a = in.nextInt();

		if (a == 0) {
			System.out.println(
					"Вы ввели ноль. Ноль однозначное число, не не является ни положительным, ни отрицательным.");
		} else if (a < 0) {
			System.out.println("Введённое число является отрицательным.");
		} else if (a > 0) {
			System.out.println("Введённое число является положительным.");
		}
		int m = 0;
		for (; a != 0; a /= 10)
			m++;
		{
			System.out.println("Данное число является " + m + "-значным.");
		}

		in.close();
	}

}
