package Lesson9;
import java.util.random.*;
import java.util.Arrays;
 
public class Task1 {
	public void task() {
		int n = Integer.parseInt(System.console().readLine("Write n: "));
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 20;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%1000;
		}
		int a = g.nextInt()%10;
		System.out.println("a");
		System.out.println("Line 3: " + Arrays.toString(my_array[2]));
	}
}
