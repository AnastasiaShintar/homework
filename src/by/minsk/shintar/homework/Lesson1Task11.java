package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Task11 {

	public static void main(String[] args) {
		System.out.println("Введите символ 'q'");
		
		Scanner letter = new Scanner(System.in);
		String symbol = letter.next();
		
		while(!symbol.equals("q")) {
			
		System.out.println("Finish");
		}
		
		letter.close();
	}
}
