mport java.net.*;

public class TCPServerOptions {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket();
        server.setReuseAddress(true);
        server.bind(new InetSocketAddress(1234));
        System.out.println("Server socket options set and bound.");
        server.close();
    }
}