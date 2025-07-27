import java.net.*;
import java.util.*;

public class PrintHTTPHeader {
    public static void main(String[] args) throws Exception {
        URLConnection con = new URL("https://www.google.com").openConnection();
        con.getHeaderFields().forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
