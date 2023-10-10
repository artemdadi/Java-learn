package Lesson1;
import java.util.random.*;

public class Task3 {
    public void task() {
	RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
	int a = g.nextInt()%10;
	int b = g.nextInt()%10;
	int c = g.nextInt()%10;
	int d = g.nextInt()%10;
	int e = g.nextInt()%10;
	int min = a;
	if (b < min){
	    min = b;
	}
	if (c < min){
	    min = c;
	}
	if (d < min){
	    min = d;
	}
	if (e < min){
	    min = e;
	}
	int max = a;
	if (b > max){
	    max = b;
	}
	if (c > max){
	    max = c;
	}
	if (d > max){
	    max = d;
	}
	if (e > max){
	    max = e;
	}
        System.out.format("Numbers: %d, %d, %d, %d, %d%nMin: %d%nMax: %d%n", a, b, c, d, e, min, max);
    }
}
