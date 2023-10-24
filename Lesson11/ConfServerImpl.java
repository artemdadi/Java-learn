import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ConfServerImpl extends UnicastRemoteObject implements ConfServer {

    public ConfServerImpl() throws RemoteException {
	super();
    }

    @Override
    public int registerConfParticipant(RegistrationInfo participant) throws RemoteException {
	try {
	    DbHandler dbh = DbHandler.getInstance();
	    dbh.addParticipant(participant);
	    return dbh.getParticipantCount();
	} catch (Exception e) {
	    e.printStackTrace();
	    throw new RemoteException(e.getMessage(), e);
	}
    }

    public static void main(String[] args) {
	try {
	    System.setProperty("java.rmi.server.hostname", InetAddress.getLocalHost().getHostAddress());
	    LocateRegistry.createRegistry(1099);
	    ConfServerImpl instance = new ConfServerImpl();
	    Naming.rebind("ConfServer", instance);
	    System.out.println("Сервис зарегистрирован");
    	} catch (Exception e) {
	    e.printStackTrace();
    	}
    }
}
