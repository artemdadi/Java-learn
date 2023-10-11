package Lesson5;
import java.util.random.*;
import java.util.Arrays;
 
public class Task2 {
	public int[][] new_rand_martrix(int array_x, int array_y) {
		RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
		int[][] result = new int[array_y][array_x];
		for (int x = 0; x < array_x; x++) {
			for (int y = 0; y < array_y; y++) {
				result[y][x] = g.nextInt()%10;
			}
		}
		return result;
	}

	static public void print_matrix(int[][] matrix) {
		for (int y = 0; y < matrix.length; y++) {
			System.out.println(Arrays.toString(matrix[y]));
		}
	}

	public int[][] add_matrixs(int[][] A, int[][] B){
		int array_y = A.length;
		int array_x = A[0].length;
		int[][] result = new int[A.length][A[0].length];
		for (int y = 0; y < array_y; y++) {
			for (int x = 0; x < array_x; x++) {
				result[y][x] = A[y][x] + B[y][x];
			}
		}
		return result;
	}

	public int[][] mul_matrixs(int[][] A, int[][] B){
		int array_y = A.length;
		int array_x = B[0].length;
		int[][] result = new int[A.length][B[0].length];
		for (int y = 0; y < array_y; y++) {
			for (int x = 0; x < array_x; x++) {
				for (int z = 0; z < array_y; z++){
					result[y][x] += A[y][z] * B[z][x];
				}
			}
		}
		return result;
	}

	public void task() {
		int[][] C = new_rand_martrix(3, 3);
		int[][] D = new_rand_martrix(3, 3);
		System.out.println("C:");
		print_matrix(C);
		System.out.println("D:");
		print_matrix(D);
		System.out.println("Sum:");
		print_matrix(add_matrixs(C, D));
		System.out.println("Mul:");
		print_matrix(mul_matrixs(C, D));
	}
}
