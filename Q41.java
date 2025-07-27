#server
import java.net.*;

public class UDPArmstrongServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5005);
        byte[] buf = new byte[100];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        String numStr = new String(packet.getData(), 0, packet.getLength());
        int n = Integer.parseInt(numStr);
        int sum = 0, temp = n;
        while (temp > 0) {
            int r = temp % 10;
            sum += r * r * r;
            temp /= 10;
        }
        String res = (sum == n) ? "Armstrong" : "Not Armstrong";
        byte[] resp = res.getBytes();
        socket.send(new DatagramPacket(resp, resp.length, packet.getAddress(), packet.getPort()));
        socket.close();
    }
}

#client

import java.net.*;

public class UDPArmstrongClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] num = "153".getBytes();
        socket.send(new DatagramPacket(num, num.length, InetAddress.getLocalHost(), 5005));
        DatagramPacket packet = new DatagramPacket(new byte[100], 100);
        socket.receive(packet);
        System.out.println("Result: " + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
