import java.net.*;

public class HeaderSpecific {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");
        URLConnection con = url.openConnection();
        System.out.println("Content-Type: " + con.getContentType());
        System.out.println("Content-Length: " + con.getContentLength());
    }
}