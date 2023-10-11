package Lesson3;
import java.util.random.*;
import java.util.Arrays;

public class Task3 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 10;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%100;
		}
		System.out.println("Array: " + Arrays.toString(my_array));
		int min = my_array[0]; 
		int max = my_array[0];
		for (int i = 1; i < array_size; i++) {
			if (my_array[i] < min) {
				min = my_array[i];
			}
			if (my_array[i] > max) {
				max = my_array[i];
			}
		}
		System.out.println("Min: " + Integer.toString(min));
		System.out.println("Max: " + Integer.toString(max));
	}
}