package Lesson3;
import java.util.random.*;
import java.util.Arrays;
 
public class Task4 {
	public void task() {
		int array_size = 5;
		int[] my_array = {4, -5, 0, 6, 8};
		System.out.println("Before: " + Arrays.toString(my_array));
		int min = my_array[0];
		int min_i = 0;
		int max = my_array[0];
		int max_i = 0;
		for (int i = 1; i < array_size; i++) {
			if (my_array[i] < min) {
				min = my_array[i];
				min_i = i;
			}
			if (my_array[i] > max) {
				max = my_array[i];
				max_i = i;
			}
		}
		int temp = my_array[max_i];
		my_array[max_i] = my_array[min_i];
		my_array[min_i] = temp;
		System.out.println("After: " + Arrays.toString(my_array));
	}
}
