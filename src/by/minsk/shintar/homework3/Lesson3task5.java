package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("������� ������ � �������� �����:");
		int a = in.nextInt();
		int b = in.nextInt();

		if (a % 2 == 0) {
			System.out.println("�������� �����: " + b);
		} else {
			System.out.println("�������� �����: " + a);
		}
		in.close();
	}
}
