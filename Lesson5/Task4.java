package Lesson5;
import java.util.random.*;
import java.util.Arrays;
import Lesson5.Task2;
 
public class Task4 {
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
			for (int y = 0; y < array_y; y++) {
				if (Integer.signum(my_array[y][x]) == -1){
					System.out.println("y: " + 
						Integer.toString(y) +
						"; x: " + Integer.toString(x) +
						" is negative");
				}
			}
		}
	}
}
