import java.net.*;

public class TCPSocketInfo {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("google.com", 80);
        System.out.println("Local Port: " + socket.getLocalPort());
        System.out.println("Remote Address: " + socket.getRemoteSocketAddress());
        socket.close();
    }
}
