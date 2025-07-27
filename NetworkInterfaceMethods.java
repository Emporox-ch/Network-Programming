import java.net.*;

public class NetworkInterfaceMethods {
    public static void main(String[] args) throws Exception {
        NetworkInterface net = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
        System.out.println("Display Name: " + net.getDisplayName());
        System.out.println("Name: " + net.getName());
        System.out.println("Is Up: " + net.isUp());
        System.out.println("Supports Multicast: " + net.supportsMulticast());
    }
}
