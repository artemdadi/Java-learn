import java.util.random.*;

class program {
    public static void main(String[] args) {
	RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
	int a = g.nextInt()%10;
	int b = g.nextInt()%10;
	int c = g.nextInt()%10;
	int d = g.nextInt()%10;
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
        System.out.format("Numbers: %d, %d, %d, %d%nMin: %d%n", a, b, c, d, min);
    }
}
