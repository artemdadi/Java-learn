import java.io.*;
import java.net.*;

public class Server {

	public Server() throws IOException {
		System.out.println("Sending messages");
		transmit("233.0.0.1");
	}
		
	public void transmit(String ipGroup) {
		try (DatagramSocket socket = new DatagramSocket()) {
			while (true) {
				System.out.println("Введите строку для передачи клиентам: ");
				String str = System.console().readLine();
				byte[] buffer = str.getBytes();
				InetAddress address = InetAddress.getByName(ipGroup);
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 1502);
				socket.send(packet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] arg) throws Exception {
		new Server();
	}
}