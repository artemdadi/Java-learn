package Lesson2;
import java.util.random.*;
 
public class Task2 {
	public void task() {
		int n = Integer.parseInt(System.console().readLine("Write n: "));
		int result = 1;
		for (int i = 1; i <= n; result = result * i++);
		System.out.println(result);
	}
}