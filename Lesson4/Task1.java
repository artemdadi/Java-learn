package Lesson4;
import java.util.random.*;
 
public class Task1 {
	public void task() {
		int n = Integer.parseInt(System.console().readLine("Write n: "));
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int a = g.nextInt()%10;
		System.out.println("a");
	}
}
