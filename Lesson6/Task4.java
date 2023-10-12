package Lesson6;
import java.util.random.*;
import java.util.Arrays;
 
public class Task4 {
	public void task() {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		Integer a = 30;//g.nextInt()%1000;
		Integer b = 18;//g.nextInt()%1000;
		Integer c = a;
		Integer d = b;
		while ( (!c.equals(0)) & (!d.equals(0)) ) {
			if (c > d) {
				c = c%d;
			} else {
				d = d%c;
			}
		}
		System.out.println("НОД: " + Integer.toString(c+d));
		System.out.println("НОК: " + Integer.toString((a*b)/(c+d)));
	}
}
