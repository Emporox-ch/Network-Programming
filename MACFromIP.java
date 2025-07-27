
import java.net.*;

public class MACFromIP {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface net = NetworkInterface.getByInetAddress(ip);
        byte[] mac = net.getHardwareAddress();

        System.out.print("MAC: ");
        for (byte b : mac) System.out.printf("%02X-", b);
    }
}
