import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

class PrintFile {
	public static void main(String[] args) {
		String file_name = args[0];
		try {
      			File file = new File(file_name);
      			Scanner myReader = new Scanner(file);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
				System.out.println(data);
      			}
      			myReader.close();
   		} catch (FileNotFoundException e) {
      			System.out.println("[MAKE] File \""+ file_name +"\" was not found");
    		}
	}
}