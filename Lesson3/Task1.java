package Lesson3;
import java.util.random.*;
 
public class Task1 {
	public void task() {
		int array_size = 10;
		int[] odd = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			odd[i] = 1 + i*2;
		}
		for (int i = 0; i < array_size-1; System.out.format("%d, ", odd[i++])){}
		System.out.format("%d%n", odd[array_size-1]);
	}
}
