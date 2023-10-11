package Lesson5;
import java.util.random.*;
import java.util.Arrays;
 
public class Task5 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_x = 5;
		int array_y = 5;
		int[][] my_array = new int[array_y][array_x];
		for (int x = 0; x < array_x; x++) {
			for (int y = 0; y < array_y; y++) {
				my_array[y][x] = g.nextInt()%10;
			}
		}
		Task2.print_matrix(my_array);
		for (int x = 0; x < array_x; x++) {
			Arrays.sort(my_array[x]);
		}
		System.out.println("After sort:");
		Task2.print_matrix(my_array);
	}
}
