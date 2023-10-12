package Lesson6;
import java.util.random.*;
import java.util.Arrays;
 
public class Task1 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 10;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%1000;
		}
		System.out.println("Array: " + Arrays.toString(my_array));
		for (int i = 0; i < array_size; i++) {
			if (my_array[i]%3 == 0){
				System.out.println(Integer.toString(my_array[i]) + " is devisible by 3");
			}
			if (my_array[i]%6 == 0){
				System.out.println(Integer.toString(my_array[i]) + " is devisible by 6");
			}
		}
		
	}
}
