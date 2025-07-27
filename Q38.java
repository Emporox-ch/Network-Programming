
//qns no 38

#server
import java.net.*;

public class UDPEchoServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket server = new DatagramSocket(1111);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        server.receive(packet);
        server.send(new DatagramPacket(packet.getData(), packet.getLength(), packet.getAddress(), packet.getPort()));
        server.close();
    }
}

#client
import java.net.*;

public class UDPEchoClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        byte[] msg = "Hello UDP".getBytes();
        DatagramPacket p = new DatagramPacket(msg, msg.length, InetAddress.getLocalHost(), 1111);
        client.send(p);
        DatagramPacket r = new DatagramPacket(new byte[1024], 1024);
        client.receive(r);
        System.out.println("Received: " + new String(r.getData(), 0, r.getLength()));
        client.close();
    }
}