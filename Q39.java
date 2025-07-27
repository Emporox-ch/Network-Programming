
#server
import java.net.*;
import java.util.*;

public class UDPDaytimeServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket server = new DatagramSocket(8888);
        byte[] buf = new byte[100];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        server.receive(packet);
        String time = new Date().toString();
        byte[] t = time.getBytes();
        server.send(new DatagramPacket(t, t.length, packet.getAddress(), packet.getPort()));
        server.close();
    }
}

#client

import java.net.*;

public class UDPDaytimeClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        client.send(new DatagramPacket(new byte[1], 1, InetAddress.getLocalHost(), 8888));
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        client.receive(packet);
        System.out.println("Server Time: " + new String(packet.getData(), 0, packet.getLength()));
        client.close();
    }
}
*/
  