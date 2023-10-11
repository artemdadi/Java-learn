package Lesson3;
import java.util.random.*;
 
public class Task2 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 10;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%100;
			System.out.println(my_array[i]);
		}
		int min = my_array[0]; 
		for (int i = 1; i < array_size; i++) {
			if (my_array[i] < min) {
				min = my_array[i];
			}
		}
		System.out.println(min);
		
	}
}
