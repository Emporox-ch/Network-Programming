import java.net.*;

public class TCPClientOptions {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();
        socket.setKeepAlive(true);
        socket.setReuseAddress(true);
        socket.setTcpNoDelay(true);
        socket.connect(new InetSocketAddress("localhost", 9999));
        System.out.println("Client socket options set and connected.");
        socket.close();
    }
}