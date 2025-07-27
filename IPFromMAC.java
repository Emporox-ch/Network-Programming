import java.net.*;
import java.util.*;

  public class IPFromMAC {
    public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface net = interfaces.nextElement();
            byte[] mac = net.getHardwareAddress();
            if (mac != null) {
                Enumeration<InetAddress> addrs = net.getInetAddresses();
                while (addrs.hasMoreElements()) {
                    System.out.println("IP: " + addrs.nextElement().getHostAddress());
                }
            }
        }
    }
}