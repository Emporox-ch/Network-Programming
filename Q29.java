
#server
import java.io.*;
import java.net.*;

public class FactorialServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1237);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        int num = Integer.parseInt(in.readLine());
        int fact = 1;
        for (int i = 2; i <= num; i++) fact *= i;
        out.println("Factorial: " + fact);
        server.close();
    }
}


#client
import java.io.*;
import java.net.*;

public class FactorialClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1237);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out.println("5");
        System.out.println(in.readLine());
        socket.close();
    }
}