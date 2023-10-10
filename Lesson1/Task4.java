package Lesson1;
import java.util.random.*;

public class Task4 {
	public void task() {
	String name1 = System.console().readLine("Введите имя 1: ");
	String name2 = System.console().readLine("Введите имя 2: ");
	if (name1.equals(name2)){
		System.out.println(name1 + " и " + name2 + " тезки");
	}
	}
}