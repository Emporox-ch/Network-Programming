//#server
import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String msg;
        while ((msg = in.readLine()) != null) {
            out.println("Echo: " + msg);
        }
        server.close();
    }
}

//#client

import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg;
        while ((msg = kb.readLine()) != null) {
            out.println(msg);
            System.out.println(in.readLine());
        }
        socket.close();
    }
}
