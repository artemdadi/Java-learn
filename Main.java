import java.lang.reflect.*;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

@SuppressWarnings("unchecked")
class Main {
	public static void main(String[] args) {
		String lesson_n = args[0];
		String task_n = args[1];
		try {
      			File tasks_file = new File("Lesson" + lesson_n + "\\Tasks.txt");
      			Scanner myReader = new Scanner(tasks_file);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();//    
				if (data.substring(0, 1).equals(task_n)){
					System.out.println(data);
				}   	
      			}
      			myReader.close();
   		} catch (FileNotFoundException e) {
      			System.out.println("[MAKE] File \"Lesson" + lesson_n + "\\Tasks.txt\" with tasks was not found");
    		}
		System.out.println("-------Complete task-------");
		try {
			Class Task = Class.forName("Lesson" + lesson_n + ".Task" + task_n);
			Object task = Task.getDeclaredConstructor().newInstance();
			task.getClass().getMethod("task").invoke(task);
		} catch (Exception e) {System.out.println(e);}
	}
}
