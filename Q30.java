#server
import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1238);
        Socket socket = server.accept();
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String line;
        while ((line = br.readLine()) != null) out.println(line);
        server.close();
    }
}


#client
import java.io.*;
import java.net.*;

public class FileClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1238);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) System.out.println(line);
        socket.close();
    }
}
