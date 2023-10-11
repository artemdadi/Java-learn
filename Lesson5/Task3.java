package Lesson5;
import java.util.random.*;
import java.util.Arrays;
import Lesson5.Task2;
 
public class Task3 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_x = 2;
		int array_y = 2;
		int[][] my_array = new int[array_y][array_x];
		for (int x = 0; x < array_x; x++) {
			for (int y = 0; y < array_y; y++) {
				my_array[y][x] = g.nextInt()%10;
			}
		}
		int sum = 0;
		for (int x = 0; x < array_x; x++) {
			for (int y = 0; y < array_y; y++) {
				sum += my_array[y][x];
			}
		}
		Task2.print_matrix(my_array);
		System.out.println("Sum: " + Integer.toString(sum));
	}
}
