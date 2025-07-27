import java.net.*;
import java.util.*;

public class IPAndMAC {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface net = NetworkInterface.getByInetAddress(ip);
        byte[] mac = net.getHardwareAddress();

        System.out.println("IP: " + ip.getHostAddress());
        System.out.print("MAC: ");
        for (int i = 0; i < mac.length; i++) {
            System.out.printf("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
        }
    }
}