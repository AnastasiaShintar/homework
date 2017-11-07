package by.minsk.shintar.homework3;

public class Lesson3task10 {

	public static void main(String[] args) {

		int array[] = new int[] { -27, -25, -5, 4, 51, 234 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {

				System.out.println("Первое положительное число массива:" + array[i]);
				System.out.println("Его номер в массиве:" + i);
				break;
			}
		}
	}
}
