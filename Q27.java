//#server
import java.io.*;
import java.net.*;
import java.util.Date;

public class DaytimeServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1235);
        Socket socket = server.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(new Date().toString());
        server.close();
    }
}

//#client

import java.io.*;
import java.net.*;

public class DaytimeClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1235);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Server Time: " + in.readLine());
        socket.close();
    }
}
