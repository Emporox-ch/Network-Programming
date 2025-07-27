import java.net.*;

public class UDPOptions {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        socket.setReuseAddress(true);
        socket.setSoTimeout(2000);
        socket.setTrafficClass(0x10);
        System.out.println("UDP options set.");
        socket.close();
    }
}