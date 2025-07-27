#server
import javax.net.ssl.*;
import java.io.*;

public class SSLServer {
    public static void main(String[] args) throws Exception {
        SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket server = (SSLServerSocket) ssf.createServerSocket(8443);
        SSLSocket socket = (SSLSocket) server.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Secure message: " + br.readLine());
        server.close();
    }
}

#cleint
import javax.net.ssl.*;
import java.io.*;

public class SSLClient {
    public static void main(String[] args) throws Exception {
        SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) sf.createSocket("localhost", 8443);
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        pw.println("Hello Secure Server");
        socket.close();
    }
}