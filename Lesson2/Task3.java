package Lesson2;
import java.util.random.*;
 
public class Task3 {
	public void task() {
		int i = 1;
		while (i<100) {System.out.println(i++);}
		//second part
		int result = 1;
		int n = Integer.parseInt(System.console().readLine("Write n: "));
		i = 1;
		while (i <= n) {result = result * i++;}
		System.out.println(result);
	}
}