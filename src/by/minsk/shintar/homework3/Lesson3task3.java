package by.minsk.shintar.homework3;

import java.util.Scanner;

public class Lesson3task3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("������� ������� ����:");
		int D = in.nextInt();
		double S1 = Math.PI * D * D / 4;

		System.out.println("������� ������ ����:");
		int H = in.nextInt();
		double S2 = Math.PI * D * H;

		double sum = S1 + S2;

		System.out.println("������� ������ ������ (�/��.�):");
		int R = in.nextInt();
		double finalR = Math.ceil(sum / R);

		System.out.println("��� �������� ���� ��� ������������ " + finalR + " �����");
		in.close();
	}
}
