package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("������� ���:");
		int year = in.nextInt();

		if (year % 4 != 0) {
			System.out.println("��������� ��� �� �������� ����������.");
		} else if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("��������� ��� �������� ����������.");
			} else if (year % 400 != 0) {
				System.out.println("��������� ��� �� �������� ����������.");
			} else {
				System.out.println("��������� ��� �������� ����������.");
			}
		}
		in.close();
	}

}
