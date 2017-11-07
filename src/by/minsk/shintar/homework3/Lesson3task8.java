package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Введите натуральное число:");
		long num = in.nextLong();
		System.out.println("Введите цифру, которую необходимо удалить из числа:");
		long dig = in.nextLong();
		long result = 0;
		int n = 1;

		for (; num != 0; num /= 10) {
			long rem = num % 10;

			if (Math.abs(rem) != dig) {
				result = result + rem * n;
				n *= 10;
			}
		}
		in.close();

		System.out.println("Новое число: " + result);
	}

}