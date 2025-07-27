
import java.net.*;

public class SplitURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com:8080/test/page.html?query=1#section");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref: " + url.getRef());
    }
}
