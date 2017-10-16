package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Tasks5_6and7 {
	
	public static void main(String[] args) {
	
		System.out.println("Введите число от -9 до 9.");		
		Scanner numberdetermination = new Scanner(System.in);
		int n = numberdetermination.nextInt();
			
			while (n < -9 || n > 9) {
				System.out.println("Введите правильное число!");
				n = numberdetermination.nextInt();
			}
				
			switch (n) {
			case -9:
				System.out.println("Минус девять.\nНечетное отрицательное.");
				break;
			case -8:
				System.out.println("Минус восемь.\nЧетное отрицательное.");
				break;
			case -7:
				System.out.println("Минус семь.\nНечетное отрицательное.");
				break;
			case -6:
				System.out.println("Минус шесть.\nЧетное отрицательное.");
				break;
			case -5:
				System.out.println("Минус пять.\nНечетное отрицательное.");
				break;
			case -4:
				System.out.println("Минус четыре.\nЧетное отрицательное.");
				break;
			case -3:
				System.out.println("Минус три.\nНечетное отрицательное.");
				break;
			case -2:
				System.out.println("Минус два.\nЧетное отрицательное.");
				break;
			case -1:
				System.out.println("Минус один.\nНечетное отрицательное.");
				break;
			case 0:
				System.out.println("Ноль.\nЧисло ноль является четным. Оно не является ни положительным, ни отрицательным.");
				break;
			case 1:
				System.out.println("Один.\nНечетное положительное.");
				break;
			case 2:
				System.out.println("Два.\nЧетное положительное.");
				break;
			case 3:
				System.out.println("Три.\nНечетное положительное.");
				break;
			case 4:
				System.out.println("Четыре.\nЧетное положительное.");
				break;
			case 5:
				System.out.println("Пять.\nНечетное положительное.");
				break;
			case 6:
				System.out.println("Шесть.\nЧетное положительное.");
				break;
			case 7:
				System.out.println("Семь.\nНечетное положительное.");
				break;
			case 8:
				System.out.println("Восемь.\nЧетное положительное.");
				break;
			case 9:
				System.out.println("Девять.\nНечетное положительное.");
				break;
			default:
				System.out.println("Default!");
			}
			
			numberdetermination.close();
	}
}



