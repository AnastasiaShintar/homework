package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Tasks5_6and7 {
	
	public static void main(String[] args) {
	
		System.out.println("������� ����� �� -9 �� 9.");		
		Scanner numberdetermination = new Scanner(System.in);
		int n = numberdetermination.nextInt();
			
			while (n < -9 || n > 9) {
				System.out.println("������� ���������� �����!");
				n = numberdetermination.nextInt();
			}
				
			switch (n) {
			case -9:
				System.out.println("����� ������.\n�������� �������������.");
				break;
			case -8:
				System.out.println("����� ������.\n������ �������������.");
				break;
			case -7:
				System.out.println("����� ����.\n�������� �������������.");
				break;
			case -6:
				System.out.println("����� �����.\n������ �������������.");
				break;
			case -5:
				System.out.println("����� ����.\n�������� �������������.");
				break;
			case -4:
				System.out.println("����� ������.\n������ �������������.");
				break;
			case -3:
				System.out.println("����� ���.\n�������� �������������.");
				break;
			case -2:
				System.out.println("����� ���.\n������ �������������.");
				break;
			case -1:
				System.out.println("����� ����.\n�������� �������������.");
				break;
			case 0:
				System.out.println("����.\n����� ���� �������� ������. ��� �� �������� �� �������������, �� �������������.");
				break;
			case 1:
				System.out.println("����.\n�������� �������������.");
				break;
			case 2:
				System.out.println("���.\n������ �������������.");
				break;
			case 3:
				System.out.println("���.\n�������� �������������.");
				break;
			case 4:
				System.out.println("������.\n������ �������������.");
				break;
			case 5:
				System.out.println("����.\n�������� �������������.");
				break;
			case 6:
				System.out.println("�����.\n������ �������������.");
				break;
			case 7:
				System.out.println("����.\n�������� �������������.");
				break;
			case 8:
				System.out.println("������.\n������ �������������.");
				break;
			case 9:
				System.out.println("������.\n�������� �������������.");
				break;
			default:
				System.out.println("Default!");
			}
			
			numberdetermination.close();
	}
}



