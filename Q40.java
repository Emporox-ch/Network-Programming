
  #server
  import java.net.*;

public class UDPTextServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket server = new DatagramSocket(7777);
        byte[] buf = new byte[1024];
        DatagramPacket p = new DatagramPacket(buf, buf.length);
        server.receive(p);
        System.out.println("Received: " + new String(p.getData(), 0, p.getLength()));
        server.close();
    }
}

#client

import java.net.*;

public class UDPTextClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket();
        byte[] msg = "Hello Server".getBytes();
        DatagramPacket p = new DatagramPacket(msg, msg.length, InetAddress.getLocalHost(), 7777);
        client.send(p);
        client.close();
   