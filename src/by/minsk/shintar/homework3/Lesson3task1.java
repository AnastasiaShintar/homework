package by.minsk.shintar.homework3;

import java.util.Random;

public class Lesson3task1 {

	public static void main(String[] args) {

		Random random = new Random();

		int x = random.nextInt(900) + 100;
		int hund = x / 100;
		int t = (x / 10) % 10;
		int one = x % 10;
		int sum = hund + t + one;
		int mult = hund * t * one;

		System.out.println(x);
		System.out.println(sum);
		System.out.println(mult);
	}

}
