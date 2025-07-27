import java.net.*;

public class MulticastReceiver {
    public static void main(String[] args) throws Exception {
        MulticastSocket socket = new MulticastSocket(4446);
        InetAddress group = InetAddress.getByName("230.0.0.0");
        socket.joinGroup(group);
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        System.out.println("Received: " + new String(packet.getData(), 0, packet.getLength()));
        socket.leaveGroup(group);
        socket.close();
    }
}