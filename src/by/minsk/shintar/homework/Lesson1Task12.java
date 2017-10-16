package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Task12 {

		public static void main(String[] args) {
			System.out.println("¬ведите слово 'stop'");
			
			Scanner word = new Scanner(System.in);
			String symbol = word.next();
			
			while(!symbol.equals("stop")) {
			System.out.println("Finish");
			
			}
				
			word.close();
		}
	}

