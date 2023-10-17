import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.Calendar;
import java.nio.channels.*;
import java.util.concurrent.*;

public class ServerTCP extends Thread {
    
    ThreadFactory threadFactory;
    ServerSocketChannel servSockChannel;
    ServerSocket servSocket;

    public ServerTCP() {
	try {
	    System.out.println("Запуск сервера");
	    servSockChannel = ServerSocketChannel.open();
	    servSockChannel.bind(new InetSocketAddress(1500));
	    servSocket = servSockChannel.socket();
	    threadFactory = Thread.ofVirtual().factory();
	    start();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void answer(Socket clientSocket) {
	try {
		System.out.println("Принято соединение " + clientSocket.getInetAddress().getHostAddress());
		ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
		DateMessage dateMessage = new DateMessage(Calendar.getInstance().getTime(), "Текущая дата/время на сервере");
		out.writeObject(dateMessage);
		clientSocket.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    @Override
    public void run() {
	try {
		while (true) {
			SocketChannel clientSocketChannel = servSockChannel.accept();
			threadFactory.newThread(()->{ answer(clientSocketChannel.socket()); }).start();
		}
	} catch (AsynchronousCloseException e) {
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		servSockChannel.close();
	    } catch (IOException e) {
		throw new RuntimeException(e);
	    }
	}
    }
    public static void main(String[] args) {
	ServerTCP serv = new ServerTCP();
	while (true) {
		String input = System.console().readLine();
		if (input.equals("close"))
		{
			try {
				serv.interrupt();
			}  catch (Exception e) {
	    			e.printStackTrace();
			}
			break;
		}
	}
    }
}
