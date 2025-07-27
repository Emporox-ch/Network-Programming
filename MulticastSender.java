import java.net.*;

public class MulticastSender {
    public static void main(String[] args) throws Exception {
        InetAddress group = InetAddress.getByName("230.0.0.0");
        MulticastSocket socket = new MulticastSocket();
        String msg = "Hello Multicast";
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, 4446);
        socket.send(packet);
        socket.close();
    }
}
