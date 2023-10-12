import java.net.*;
import java.util.stream.*;

public class Client {
	public static void main(String[] arg) throws Exception {
		System.out.println("Ожидание сообщения от сервера");
		InetSocketAddress socket_address = new InetSocketAddress("233.0.0.1", 1502);
		NetworkInterface net_interface = NetworkInterface.getByName("localhost");
		try (MulticastSocket socket = new MulticastSocket(1502)) {
			socket.joinGroup(socket_address, net_interface);
			while (true) {
				byte[] buffer = new byte[256];
				DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
				socket.receive(packet);
				String str = new String(packet.getData());
				System.out.println("Получено сообщение: " + str.trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}