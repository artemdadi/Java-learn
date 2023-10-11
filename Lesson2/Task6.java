package Lesson2;
import java.util.random.*;
 
public class Task6 {
	public void task() {
		// строка для поиска
		String searchMe = "Мама мыла раму и лыжи мыла";
		//количество символов в строке
		int max = searchMe.length();
		// символ, который нужно найти в строке
		char symb = 'ы';
		// переключатель найдено/не найдено
		int symb_count = 0;
		for (int i = 0; i < max; i++) {
			// если символ на позиции i в строке равен искомому символу
			if (searchMe.charAt(i) == symb) {
				symb_count+=1;
			}
		}
		// выводим соответствующее сообщение: найден или не найден символ
		if (symb_count>=2) { 
		System.out.println("Символ '" + symb + "' найден в строке в кол-ве: " + Integer.toString(symb_count)); 
		} else { System.out.println("Символ '" + symb + "' не найден в строке более 2 раз"); }
	}
}
