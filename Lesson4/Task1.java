package Lesson4;
import java.util.random.*;
import java.util.Arrays;

public class Task1 {
	public static void bubbleSort(int[] arr){
 		for(int i = arr.length-1 ; i > 0 ; i--){
 			for(int j = 0 ; j < i ; j++){
				if(arr[j] > arr[j+1]){
 					int tmp = arr[j];
 					arr[j] = arr[j+1];
 					arr[j+1] = tmp;
 				}
 			}
 		}
	}
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int array_size = 20;
		int[] my_array = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			my_array[i] = g.nextInt()%1000;
		}
		System.out.println("Before: " + Arrays.toString(my_array));
		bubbleSort(my_array);
		System.out.println("After: " + Arrays.toString(my_array));
	}
}
