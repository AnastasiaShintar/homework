package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task6 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("������� ����� �����:");
		int a = in.nextInt();

		if (a == 0) {
			System.out.println(
					"�� ����� ����. ���� ����������� �����, �� �� �������� �� �������������, �� �������������.");
		} else if (a < 0) {
			System.out.println("�������� ����� �������� �������������.");
		} else if (a > 0) {
			System.out.println("�������� ����� �������� �������������.");
		}
		int m = 0;
		for (; a != 0; a /= 10)
			m++;
		{
			System.out.println("������ ����� �������� " + m + "-�������.");
		}

		in.close();
	}

}
