package by.minsk.shintar.homework;

import java.util.Scanner;

public class Lesson1Tasks3and4 {
	public static void main(String[] args) {
	
		Scanner numbers = new Scanner(System.in);
		int x = numbers.nextInt();
		int y = numbers.nextInt();
		String operation = numbers.next();
		
		if (operation.equals("+")) {
			System.out.println(x+y);
		}
		else if (operation.equals("-")) {
			System.out.println(x-y);
		}
		else if (operation.equals("*")) {
			System.out.println(x*y);
		}
		else if (operation.equals("/")) {
			System.out.println(x/y);
		}
		numbers.close();
		
	}

}
