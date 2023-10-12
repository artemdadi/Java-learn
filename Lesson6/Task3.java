package Lesson6;
import java.util.random.*;
import java.util.Arrays;
 
public class Task3 {
	public void task() {
		int A = Integer.parseInt(System.console().readLine("Write cathet A: "));
		int B = Integer.parseInt(System.console().readLine("Write cathet B: "));
		double area = (A*B)/2.0;
		double C = Math.sqrt(A*A + B*B);
		double P = A + B + C;
		System.out.format("A: %d, B: %d, C: %f, area: %f, P: %f%n", A, B, C, area, P);
	}
}
