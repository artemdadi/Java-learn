package Lesson3;
import java.util.random.*;
import java.util.Arrays;

public class Task5 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 10;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%10;
		}
		System.out.println("Array: " + Arrays.toString(my_array));
		int sum = 0;
		for (int i = 0; i < array_size; i++) {
			sum+=my_array[i];
		}
		System.out.println("Sum: " + Integer.toString(sum));
	}
}
