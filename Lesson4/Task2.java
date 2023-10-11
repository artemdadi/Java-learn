package Lesson4;
import java.util.random.*;
import java.util.Arrays;
import java.util.Collections;
 
public class Task2 {
	public void task() {
		String[] marks = {"BMW", "Honda", "Volkswagen", "Ford", "Hyundai", "Audi", "Porsche", "Nissan"};
		System.out.println("Before: " + Arrays.toString(marks));
		Arrays.sort(marks);
		System.out.println("First sort: " + Arrays.toString(marks));
		Arrays.sort(marks, Collections.reverseOrder());
		System.out.println("Reverse: " + Arrays.toString(marks));
	}
}
