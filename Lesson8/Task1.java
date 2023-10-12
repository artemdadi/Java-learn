package Lesson8;
import java.util.random.*;
import java.util.Arrays;
 
public class Task1 {
	public interface Number<T> {
		T add(T other);
		T sub(T other);
		T mul(T other);
		String toString();
	}

	public class Complex implements Number<Complex>{
		private Integer real;
		private Integer img;

		public Complex(int real, int img) {
			this.real = real;
			this.img = img;
		}

		public Complex() {
			this.real = 0;
			this.img = 0;
		}

		public Integer getReal() { return this.real;}
		public void setReal(int real) { this.real = real;}

		public Integer getImg() { return this.img;}
		public void setImg(int img) { this.img = img;}

		
		public Complex add(Complex other) {
			Complex result = new Complex(real + other.real, img + other.img);
			return result;
		}
		
		public Complex sub(Complex other) {
			Complex result = new Complex(real - other.real, img - other.img);
			return result;
		}

		public Complex mul(Complex other) {
			Integer new_real = real * other.real - img * other.img;
			Integer new_img = real * other.img + img * other.real;
			Complex result = new Complex(new_real, new_img);
			return result;
		}
		
		@Override
		public String toString() {
			String result = real.toString() + " + " + img.toString() + "i";
			if (Integer.signum(img) == -1) {
				result = result.replaceFirst("\\+ -", "- ");
			}
			return result;
		}
	}
	public void task() {
		Complex A = new Complex(2, 3);
		Complex B = new Complex(0, 0);
		B.setReal(1);
		B.setImg(-1);
		System.out.println("A = " + A.toString());
		System.out.println("B = " + B.toString());
		System.out.println("A + B = " + A.add(B).toString());
		System.out.println("A - B = " + A.sub(B).toString());
		System.out.println("A * B = " + A.mul(B).toString());
	}
}
