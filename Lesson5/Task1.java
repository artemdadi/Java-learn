package Lesson5;
import java.util.random.*;
import java.util.Arrays;
 
public class Task1 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_x = 5;
		int array_y = 6;
		int[][] my_array = new int[array_y][array_x];
		for (int x = 0; x < array_x; x++) {
			for (int y = 0; y < array_y; y++) {
				my_array[y][x] = g.nextInt()%100;
			}
		}
		System.out.println("Line 3: " + Arrays.toString(my_array[2]));
	}
}
