package Lesson1;
import java.util.random.*;

public class Task2 {

    public int boolToInt(boolean b) {
	return b ? 1 : 0;
    }
    
    public void task() {
	RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
	int a = g.nextInt()%10;
	int b = g.nextInt()%10;
	int c = g.nextInt()%10;
	int d = g.nextInt()%10;
	int max = a;
	int max_count = 1;
	if (b > max){
	    max = b;
	}
	if (c > max){
	    max = c;
	}
	if (d > max){
	    max = d;
	}
	max_count = boolToInt(a == max) + boolToInt(b == max) + boolToInt(c == max) + boolToInt(d == max);
        System.out.format("Numbers: %d, %d, %d, %d%nMax: %d%nMax count: %d%n", a, b, c, d, max, max_count);
    }
}
