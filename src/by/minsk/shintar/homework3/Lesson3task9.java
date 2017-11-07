package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task9 {

	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Введите знак действия:");
			String sign = in.next();
			if (sign.equals("0")) {
				System.out.println("Вы ввели ноль.");
			}
			switch (sign) {
			case "+":
				System.out.println("Введите первое число:");
				int a1 = in.nextInt();
				System.out.println("Введите второе число:");
				int b1 = in.nextInt();
				int res1 = a1 + b1;
				System.out.println(res1);
				break;
			case "-":
				System.out.println("Введите первое число:");
				int a2 = in.nextInt();
				System.out.println("Введите второе число:");
				int b2 = in.nextInt();
				int res2 = a2 - b2;
				System.out.println(res2);
				break;
			case "*":
				System.out.println("Введите первое число:");
				int a3 = in.nextInt();
				System.out.println("Введите второе число:");
				int b3 = in.nextInt();
				int res3 = a3 * b3;
				System.out.println(res3);
				break;
			case "/":
				System.out.println("Введите первое число:");
				int a4 = in.nextInt();
				System.out.println("Введите второе число:");
				int b4 = in.nextInt();
				if (b4 != 0) {
					int res4 = a4 / b4;
					System.out.println(res4);
				} else
					System.out.println("На ноль делить нельзя!");
				break;
			default:
				System.out.println("Введите корректный знак операции");
				break;
			}
			if (sign.equals("0")) {
				System.out.println("Процесс работы программы остановлен");
				break;
			}
		}

	}
}
