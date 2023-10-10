package Lesson2;
import java.util.random.*;
 
public class Task4 {
	public void task() {
		int x = Integer.parseInt(System.console().readLine("Write x: "));
		int n = Integer.parseInt(System.console().readLine("Write n: "));
		int result = 1;
		for (int i = 0; i < n; i++) {result = result*x;}
		System.out.println(result);
	}
}