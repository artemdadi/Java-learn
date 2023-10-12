package Lesson6;
import java.util.random.*;
import java.util.Arrays;
 
public class Task2 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 10;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%100;
		}
		int sum = 0;
    		for (int value : my_array) {
        		sum += value;
    		}
		System.out.println("Array: " + Arrays.toString(my_array));
		System.out.println("Average: " + Float.toString(sum/my_array.length));
	}
}
