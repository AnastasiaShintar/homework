package by.minsk.shintar.homework;

import java.util.Arrays;

public class Lesson1Task10 {
	
	public static void main(String[] args) {
		
		int array[] = {300,115,100};
							
		Arrays.sort(array);
		int max = array[array.length-1];
		int min = array[0];
		
		for(int i = 0; i < array.length; i++){
		if(array[i] < array[0]) 
		min = array[i];}
		System.out.println(max+min);
		}
		}
		

				

		

	


