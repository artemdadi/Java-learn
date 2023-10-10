import java.io.*; 
import java.util.Scanner; 

class CopyAndReplace {
	public static void main(String[] args) {
		String src_file_name = args[0];
		String dst_file_name = args[1];
		String old_string = args[2];
		String new_string = args[3];
		try {
      			File src_file = new File(src_file_name);
			Scanner myReader = new Scanner(src_file);
			File dst_file = new File(dst_file_name);
			FileWriter myWriter = new FileWriter(dst_file);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
				char[] chars = (data + "\n").toCharArray();
				myWriter.write(chars);
      			}
      			myReader.close();
			myWriter.close();
   		} catch (FileNotFoundException e) {
      			System.out.println("[MAKE] File \""+ src_file_name +"\" was not found");
    		} catch (IOException e) {
			System.out.println("[MAKE] " + e.getMessage());
			e.printStackTrace();
		}
	}
}