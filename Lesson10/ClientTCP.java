import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTCP {

    public static void main(String[] args) {
	try (Socket clientSocket = new Socket("localhost", 1500)) {
		try (ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream())) {
		    DateMessage dateMessage = (DateMessage) in.readObject();
		    System.out.println(dateMessage.getMessage());
		    System.out.println(dateMessage.getDate());
		    System.out.println("Нажмите Enter для выхода...");
		    Scanner scanner = new Scanner(System.in);
		    scanner.nextLine();
		}
	} catch (Exception e) {
		e.printStackTrace();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
    }
}
