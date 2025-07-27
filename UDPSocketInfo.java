import java.net.*;

public class UDPSocketInfo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        socket.connect(InetAddress.getByName("localhost"), 1234);
        System.out.println("Local Port: " + socket.getLocalPort());
        System.out.println("Remote Addr: " + socket.getRemoteSocketAddress());
        socket.close();
    }
}

