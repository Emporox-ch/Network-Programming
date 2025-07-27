
//#server
import java.io.*;
import java.net.*;

public class TextServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1236);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received: " + line);
        }
        server.close();
    }
}


//#client
import java.io.*;
import java.net.*;

public class TextClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1236);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while ((msg = kb.readLine()) != null) out.println(msg);
        socket.close();
    }
}

