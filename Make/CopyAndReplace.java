import java.io.*; 
import java.util.Scanner; 

class CopyAndReplace {
	public static void main(String[] args) {
		String src_file_name = args[0];
		String dst_file_name = args[1];
		String [][] replace_patterns = new String[args.length-2][2];
		for (int i = 2; i < args.length; i ++) {
			String pattern = args[i];
			int delim_index = pattern.indexOf("|");
			replace_patterns[i-2][0] = pattern.substring(0, delim_index);
			replace_patterns[i-2][1] = pattern.substring(delim_index + 1, pattern.length());
		}
		try {
      			File src_file = new File(src_file_name);
			Scanner myReader = new Scanner(src_file);
			File dst_file = new File(dst_file_name);
			FileWriter myWriter = new FileWriter(dst_file);
      			while (myReader.hasNextLine()) {
        			String data = myReader.nextLine();
				for (int i = 0; i < replace_patterns.length; i++) {
					data = data.replaceAll(replace_patterns[i][0], replace_patterns[i][1]);
				}
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