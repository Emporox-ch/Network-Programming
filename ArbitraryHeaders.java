import java.net.*;
import java.util.*;

public class ArbitraryHeaders {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");
        URLConnection con = url.openConnection();
        Map<String, List<String>> headers = con.getHeaderFields();
        headers.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}