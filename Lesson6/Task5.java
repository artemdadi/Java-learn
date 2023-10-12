package Lesson6;
import java.util.random.*;
import java.util.Arrays;
 
public class Task5 {
	public void task() {
		int h = Integer.parseInt(System.console().readLine("Write h: "));
		int r = Integer.parseInt(System.console().readLine("Write r: "));
		double V = 1/3.0 * Math.PI * r*r *h;
		System.out.println("V of cone: " + Double.toString(V));
	}
}
