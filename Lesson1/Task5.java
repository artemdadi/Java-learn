package Lesson1;
import java.util.random.*;
 
public class Task5 {
	public void task() {
		int month = Integer.parseInt(System.console().readLine("Enter month as int: "));
		String season = "Wrong number";
		switch (month) {
			case 12 : case 1: case 2:
				season = "Winter";
				break;
			case 3: case 4: case 5:
				season = "Spring";
				break;
			case 6: case 7: case 8:
				season = "Autumn";
				break;
			case 9: case 10: case 11:
				season = "Summer";
				break;
		}
		System.out.println(season);
	}
}