package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Task8 {
	
	public static void main(String[] args) {
		System.out.println("������� �������� ������ � ������� �����:");
		
		Scanner season = new Scanner(System.in);
		String month = season.nextLine();
		switch (month) {
		case "������":
			System.out.println("����");
		break;
		case "�������":
			System.out.println("����");
		break;
		case "�������":
			System.out.println("����");
		break;
		case "����":
			System.out.println("�����");
		break;
		case "������":
			System.out.println("�����");
		break;
		case "���":
			System.out.println("�����");
		break;
		case "����":
			System.out.println("����");
		break;
		case "����":
			System.out.println("����");
		break;
		case "������":
			System.out.println("����");
		break;
		case "��������":
			System.out.println("�����");
		break;
		case "�������":
			System.out.println("�����");
		break;
		case "������":
			System.out.println("�����");
		break;
		default:
			System.out.println("������� ����� �������� ������");
		}
			
		season.close();
				
	}

}
