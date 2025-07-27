// Interface

import java.rmi.*;

public interface GCDService extends Remote {
    int gcd(int a, int b) throws RemoteException;
}


// Implementation

import java.rmi.server.*;
import java.rmi.*;

public class GCDServiceImpl extends UnicastRemoteObject implements GCDService {
    protected GCDServiceImpl() throws RemoteException { super(); }
    public int gcd(int a, int b) throws RemoteException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        Naming.rebind("gcd", new GCDServiceImpl());
        System.out.println("GCD RMI Service Running...");
    }
}


// Client

import java.rmi.*;

public class GCDClient {
    public static void main(String[] args) throws Exception {
        GCDService stub = (GCDService) Naming.lookup("gcd");
        System.out.println("GCD of 48 and 18 is: " + stub.gcd(48, 18));
    }
}



