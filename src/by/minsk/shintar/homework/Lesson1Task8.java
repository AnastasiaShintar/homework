package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Task8 {
	
	public static void main(String[] args) {
		System.out.println("Введите название месяца с большой буквы:");
		
		Scanner season = new Scanner(System.in);
		String month = season.nextLine();
		switch (month) {
		case "Январь":
			System.out.println("Зима");
		break;
		case "Февраль":
			System.out.println("Зима");
		break;
		case "Декабрь":
			System.out.println("Зима");
		break;
		case "Март":
			System.out.println("Весна");
		break;
		case "Апрель":
			System.out.println("Весна");
		break;
		case "Май":
			System.out.println("Весна");
		break;
		case "Июнь":
			System.out.println("Лето");
		break;
		case "Июль":
			System.out.println("Лето");
		break;
		case "Август":
			System.out.println("Лето");
		break;
		case "Сентябрь":
			System.out.println("Осень");
		break;
		case "Октябрь":
			System.out.println("Осень");
		break;
		case "Ноябрь":
			System.out.println("Осень");
		break;
		default:
			System.out.println("Введите верно название месяца");
		}
			
		season.close();
				
	}

}
