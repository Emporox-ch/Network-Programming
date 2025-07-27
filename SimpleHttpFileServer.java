
import com.sun.net.httpserver.*;
import java.io.*;
import java.net.*;

public class SimpleHttpFileServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/", exchange -> {
            File file = new File("index.html");
            byte[] data = new FileInputStream(file).readAllBytes();
            exchange.sendResponseHeaders(200, data.length);
            OutputStream os = exchange.getResponseBody();
            os.write(data);
            os.close();
        });
        server.setExecutor(null);
        server.start();
        System.out.println("HTTP server started on port 8000");
    }
}